package com.example.navigationview.ui.support

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SupportViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Support"
    }
    val text: LiveData<String> = _text
}