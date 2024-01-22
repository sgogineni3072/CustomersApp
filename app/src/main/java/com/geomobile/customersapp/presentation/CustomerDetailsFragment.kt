package com.geomobile.customersapp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.geomobile.customersapp.R

/**
 * A simple [Fragment] subclass.
 * Use the [CustomerDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CustomerDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_customer_details, container, false)
    }
}