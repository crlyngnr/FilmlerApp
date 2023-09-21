package com.example.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.example.filmlerapp.databinding.FragmentDetayBinding


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetayBinding.inflate(inflater,container,false)

        val bundle : DetayFragmentArgs by navArgs()
        val film = bundle.film
        binding.toolbarDetay.title = film.ad
        binding.imageFilm.setImageResource(
            resources.getIdentifier(film.resim,"drawable",requireContext().packageName)
        )
        binding.textViewFiyat.text = "${film.fiyat} ₺"


        return binding.root
    }

}