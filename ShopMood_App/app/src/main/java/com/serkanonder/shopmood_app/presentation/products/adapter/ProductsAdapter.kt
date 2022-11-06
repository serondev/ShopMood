package com.serkanonder.shopmood_app.presentation.products.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.serkanonder.shopmood_app.R
import com.serkanonder.shopmood_app.databinding.ItemProductBinding
import com.serkanonder.shopmood_app.presentation.products.model.ProductsUiModel

class ProductAdapter(
    private val onProductClick: (id: Int) -> Unit
) : ListAdapter<ProductsUiModel, ProductAdapter.ProductViewHolder>(ProductsDiffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding =
            ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    inner class ProductViewHolder(private val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(product: ProductsUiModel) {
            Glide.with(binding.root.context)
                .load(product.image)
                .error(R.drawable.google)
                .into(binding.productsImageView)

            binding.titleTextView.text = product.title
            binding.priceTextView.text = product.price.toString()
            binding.root.setOnClickListener{onProductClick(product.id)}
        }
    }
}