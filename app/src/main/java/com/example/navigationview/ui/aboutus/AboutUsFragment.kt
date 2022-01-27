package com.example.navigationview.ui.aboutus

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.navigationview.R
import com.example.navigationview.databinding.AboutUsFragmentBinding

class AboutUsFragment : Fragment() {

    private lateinit var viewModel: AboutUsViewModel
    private var _binding: AboutUsFragmentBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(AboutUsViewModel::class.java)
        _binding = AboutUsFragmentBinding.inflate(inflater, container, false)
        val root = binding.root

        val textView: TextView = binding.textAboutUs
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