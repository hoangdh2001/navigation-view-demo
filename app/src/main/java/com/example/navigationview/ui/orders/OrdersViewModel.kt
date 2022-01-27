package com.example.navigationview.ui.orders

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrdersViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Orders"
    }
    val text: LiveData<String> = _text
}