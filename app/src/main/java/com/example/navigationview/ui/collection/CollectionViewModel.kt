package com.example.navigationview.ui.collection

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CollectionViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Collection"
    }
    val text: LiveData<String> = _text
}