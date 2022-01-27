package com.example.navigationview.ui.collection

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationview.R
import com.example.navigationview.databinding.CollectionFragmentBinding

class CollectionFragment : Fragment() {

    private lateinit var viewModel: CollectionViewModel
    private var _binding: CollectionFragmentBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(CollectionViewModel::class.java)
       _binding = CollectionFragmentBinding.inflate(inflater, container, false)
       val root = binding.root

        val textView = binding.textCollection
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