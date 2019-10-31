package com.raj.kotlinlistview.LivedataModelView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Livedataviewmodel : ViewModel() {

    val initvalue = MutableLiveData<Int>()
    init {
        initvalue.value = 1
    }

}