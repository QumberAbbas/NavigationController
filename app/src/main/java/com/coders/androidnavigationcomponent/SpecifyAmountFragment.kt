package com.coders.androidnavigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class SpecifyAmountFragment : Fragment(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_specify_amount, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.send_btn).setOnClickListener(this)
        view.findViewById<Button>(R.id.cancel_btn).setOnClickListener(this)
       // view.findViewById<TextView>(R.id.recipient).text = message
    }

    override fun onClick(v: View?) {
    }
}
