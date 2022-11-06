package com.serkanonder.shopmood_app

import android.os.Bundle
import android.view.*
import android.widget.ArrayAdapter
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import com.google.android.gms.common.util.ArrayUtils.contains
import com.serkanonder.shopmood_app.data.repository.ProductRepositoryImp
import com.serkanonder.shopmood_app.databinding.FragmentDetailsBinding
import com.serkanonder.shopmood_app.databinding.FragmentSearchBinding
import com.serkanonder.shopmood_app.domain.model.Product
import com.serkanonder.shopmood_app.domain.repository.ProductRepository
import com.serkanonder.shopmood_app.presentation.products.adapter.ProductAdapter
import com.serkanonder.shopmood_app.presentation.products.model.ProductsUiModel
import com.serkanonder.shopmood_app.presentation.products.view.ProductsFragment
import com.serkanonder.shopmood_app.presentation.products.view.ProductsFragmentArgs
import com.serkanonder.shopmood_app.presentation.products.viewmodel.ProductsViewModel
import com.serkanonder.shopmood_app.remote.model.ProductRemote
import retrofit2.http.Query

class SearchFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentSearchBinding.inflate(layoutInflater)
        val product = arrayOf("Fjallraven - Foldsack","Mens Casual Premium","Mens Cotton Jacket","Mens Casual Slim Fit","John Hardy Women's","Solid Gold Petite","White Gold Plated","WD 2TB")
        val productAdapter: ArrayAdapter<String> = ArrayAdapter<String>(requireContext(),android.R.layout.simple_list_item_1,product)

        return bind.root
    }

}
