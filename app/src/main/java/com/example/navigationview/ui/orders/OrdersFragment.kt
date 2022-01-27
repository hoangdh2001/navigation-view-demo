package com.example.navigationview.ui.orders

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.navigationview.R
import com.example.navigationview.databinding.OrdersFragmentBinding

class OrdersFragment : Fragment() {

    private lateinit var viewModel: OrdersViewModel
    private var _binding: OrdersFragmentBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(OrdersViewModel::class.java)
        _binding = OrdersFragmentBinding.inflate(inflater, container, false)
        val root = binding.root

        val textView: TextView = binding.textOrders
        viewModel.text.observe(viewLifecycleOwner, {
            textView.text = it
        })
        return  root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}