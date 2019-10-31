package com.raj.kotlinlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

open class Listadptr(context: Context, var resource: Int, var list: MutableList<model>) :
    ArrayAdapter<model>(context, resource, list)  {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


      var layoutInflater:LayoutInflater= LayoutInflater.from(context)
      var view:View=layoutInflater.inflate(resource,null)

        var textview=view.findViewById(R.id.row_text) as TextView


        var itemmodel=list[position]

        textview.text=itemmodel.name


        return view



    }


    internal class ViewHolder {
        var text: TextView? = null
    }


}