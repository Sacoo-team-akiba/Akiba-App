package com.example.akiba.ui.PayLoan

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PayLoanViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Pay loan Fragment"
    }
    val text: LiveData<String> = _text
}