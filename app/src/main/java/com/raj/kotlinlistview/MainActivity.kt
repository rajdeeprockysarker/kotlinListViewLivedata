package com.raj.kotlinlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.raj.kotlinlistview.LivedataModelView.Livedataviewmodel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list= mutableListOf<model>()

        list.add(model("Raj"))
        list.add(model("Raj1"))
        list.add(model("Raj2"))
        list.add(model("123"))

        listview.adapter=Listadptr(applicationContext,R.layout.row,list)







        val colorChangerViewModel = ViewModelProviders.of(this).get(Livedataviewmodel::class.java)
        colorChangerViewModel.initvalue.observe(this, object: Observer<Int> {
            override fun onChanged(t: Int?) {
               Log.v("Test",""+t);
            }
        })


        button.setOnClickListener {
            colorChangerViewModel.initvalue.value=2;
        }

    }
}
