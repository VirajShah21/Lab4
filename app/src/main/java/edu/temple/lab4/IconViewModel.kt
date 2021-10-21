package edu.temple.lab4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class IconViewModel : ViewModel() {
    val iconResource: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    val label: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}