package com.example.navigationview.ui.support

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.navigationview.R
import com.example.navigationview.databinding.SupportFragmentBinding

class SupportFragment : Fragment() {

    private lateinit var viewModel: SupportViewModel
    private var _binding: SupportFragmentBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(SupportViewModel::class.java)
        _binding = SupportFragmentBinding.inflate(inflater, container, false)
        val root = binding.root

        val textView: TextView = binding.textSupport
        viewModel.text.observe(viewLifecycleOwner, {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}