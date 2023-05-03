package com.example.homevork

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.homevork.databinding.FragmentButonsBinding

class ButonsFragment : Fragment() {
lateinit var binding: FragmentButonsBinding
private lateinit var viewModel: MainViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButonsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]

        binding.btnIncrement.setOnClickListener {
            viewModel.increment()
        }
        binding.btnDecelerate.setOnClickListener {
            viewModel.decrement()
        }
    }
}