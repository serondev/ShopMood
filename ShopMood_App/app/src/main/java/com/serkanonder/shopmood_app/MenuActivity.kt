package com.serkanonder.shopmood_app


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.serkanonder.shopmood_app.databinding.ActivityMenuBinding
import com.serkanonder.shopmood_app.presentation.products.view.ProductsFragment

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(ProductsFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.products -> replaceFragment(ProductsFragment())
                R.id.search -> replaceFragment(SearchFragment())
                R.id.profile -> replaceFragment(ProfileFragment())

                else ->{

                }
            }
            true
        }
}
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myNaveHostFragment, fragment)
        fragmentTransaction.commit()
    }
}
