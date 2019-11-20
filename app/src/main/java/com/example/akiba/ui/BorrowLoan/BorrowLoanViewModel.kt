package com.example.akiba.ui.BorrowLoan

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BorrowLoanViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Borrow Loan Fragment"
    }
    val text: LiveData<String> = _text
}