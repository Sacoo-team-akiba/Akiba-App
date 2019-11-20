package com.example.akiba.ui.DepositMoney

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DepositMoneyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Deposit Money Fragment"
    }
    val text: LiveData<String> = _text
}