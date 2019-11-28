package com.example.akiba.ui.BorrowLoan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.NumberPicker
import androidx.fragment.app.Fragment
import com.example.akiba.R
import kotlinx.android.synthetic.main.fragment_borrowloan.*
import kotlinx.android.synthetic.main.fragment_borrowloan.view.*
import kotlinx.android.synthetic.main.fragment_payloan.*

class BorrowLoanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val root = inflater.inflate(R.layout.fragment_borrowloan, container, false)
        root.numberPicker1.minValue = 0
        root.numberPicker1.maxValue = 31
        return root
    }


}