package com.coders.androidnavigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.fragment_specify_amount.*
import java.math.BigDecimal


class SpecifyAmountFragment : Fragment(), View.OnClickListener {

    private val args: SpecifyAmountFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_specify_amount, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recipient.text = args.name
        send_btn.setOnClickListener(this)
        cancel_btn.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.send_btn -> {
                v.findNavController().navigate(
                    SpecifyAmountFragmentDirections.actionConfirmationFragment(
                        recipient.text.toString(),
                        Money(BigDecimal(input_amount.text.toString()))
                    )
                )
            }
            R.id.cancel_btn -> v.findNavController().popBackStack()
        }
    }
}
