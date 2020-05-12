package com.coders.androidnavigationcomponent


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_confirmation.*


class ConfirmationFragment : Fragment(), View.OnClickListener {

    private val args: ConfirmationFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_confirmation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        confirmation_message.text = "${args.amount.amount} were sent to ${args.name}"
        goback.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.goback -> {
                v.findNavController().navigate(ConfirmationFragmentDirections.actionGoBack())
            }
        }
    }
}
