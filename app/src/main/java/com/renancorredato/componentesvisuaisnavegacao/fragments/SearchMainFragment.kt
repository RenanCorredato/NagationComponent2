package com.renancorredato.componentesvisuaisnavegacao.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.renancorredato.componentesvisuaisnavegacao.R
import com.renancorredato.componentesvisuaisnavegacao.databinding.FragmentSearchMainBinding

class SearchMainFragment : Fragment() {

    private lateinit var binding: FragmentSearchMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNew.setOnClickListener {
            findNavController().navigate(R.id.action_searchMainFragment_to_searchNewFragment)
        }

        binding.btnDetail.setOnClickListener {
            findNavController().navigate(R.id.action_searchMainFragment_to_searchDetailsFragment)
        }

    }

}