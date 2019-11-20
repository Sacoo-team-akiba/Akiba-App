package com.example.akiba.ui.BorrowLoan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.akiba.R

class BorrowLoanFragment : Fragment() {

    private lateinit var borrowLoanViewModel: BorrowLoanViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        borrowLoanViewModel =
            ViewModelProviders.of(this).get(BorrowLoanViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_borrowloan, container, false)
        val textView: TextView = root.findViewById(R.id.text_borrowloan)
        borrowLoanViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}