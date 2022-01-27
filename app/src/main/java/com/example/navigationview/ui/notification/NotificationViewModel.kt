package com.example.navigationview.ui.notification

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Notification"
    }
    val text: LiveData<String> = _text
}