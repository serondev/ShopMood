package com.serkanonder.shopmood_app.presentation.productsdetils.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.serkanonder.shopmood_app.R
import com.serkanonder.shopmood_app.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    private val args by navArgs<DetailsFragmentArgs>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
        binding.backImageView.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun setupViews() {
        args.apply {
            binding.priceTextView.text = productDetails.price.toString()
            binding.titleTextView.text = productDetails.title
            binding.descriptionTextView.text = productDetails.description
            binding.ratingTextView.text = productDetails.rate.toString()
        }
        Glide.with(binding.root.context)
            .load(args.productDetails.image)
            .error(R.drawable.google)
            .into(binding.detailsImageView)
    }

}