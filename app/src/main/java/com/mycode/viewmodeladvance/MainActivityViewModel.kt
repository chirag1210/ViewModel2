package com.mycode.viewmodeladvance

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count = MutableLiveData<Int>()
    val data
        get() = count

    init {
        count.value = 0
    }

    fun setUpdatedCount() {
        Log.e("clicked", "clicked")
        count.value = count.value?.plus(1)
    }
}