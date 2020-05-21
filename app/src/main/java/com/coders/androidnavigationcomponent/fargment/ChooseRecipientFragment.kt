package com.coders.androidnavigationcomponent.fargment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.coders.androidnavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_choose_recipient.*


class ChooseRecipientFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_choose_recipient, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        next_btn.setOnClickListener(this)
        cancel_btn.setOnClickListener(this)
    }

    override fun onClick(v: View) {
         when(v.id){
            R.id.next_btn ->  v.findNavController().navigate(
                ChooseRecipientFragmentDirections.actionAmountFragment(
                    input_recipient.text.toString()
                )
            )
            R.id.cancel_btn -> v.findNavController().popBackStack()
        }
    }
}
