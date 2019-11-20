package com.example.akiba.ui.PayLoan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.akiba.R

class PayLoanFragment : Fragment() {

    private lateinit var payLoanViewModel: PayLoanViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        payLoanViewModel =
            ViewModelProviders.of(this).get(PayLoanViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_payloan, container, false)
        val textView: TextView = root.findViewById(R.id.text_payloan)
        payLoanViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}