package com.example.navigationview.ui.notification

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.navigationview.R
import com.example.navigationview.databinding.NotificationFragmentBinding

class NotificationFragment : Fragment() {

    private lateinit var viewModel: NotificationViewModel
    private var _binding: NotificationFragmentBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(NotificationViewModel::class.java)

        _binding = NotificationFragmentBinding.inflate(inflater, container, false)
        val root = binding.root

        val textView: TextView = binding.textNotification
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