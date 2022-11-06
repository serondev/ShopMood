package com.serkanonder.shopmood_app

import com.serkanonder.shopmood_app.MainActivity
import com.serkanonder.shopmood_app.OnBoardingItem
import com.serkanonder.shopmood_app.OnboardingItemsAdapter
import com.serkanonder.shopmood_app.R
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.button.MaterialButton
import com.serkanonder.shopmood_app.databinding.ActivitySignInBinding
import java.text.FieldPosition


class MainActivity : AppCompatActivity() {

    private lateinit var onboardingItemsAdapter: OnboardingItemsAdapter
    private lateinit var indicatorsContrainer: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application.applicationContext as ShopMood).provideAppComponent().inject(this)
        setOnboardItems()
        setupIndicators()
        setCurrentIndicator(0)
    }

    private fun setOnboardItems() {
        onboardingItemsAdapter = OnboardingItemsAdapter(
            listOf(
                OnBoardingItem(
                    onBoardingImage = R.drawable.shoping,
                    title = "Welcome to ShopMood",
                    description = "ShopMood is a shopping app that helps you to find the best products for you."
                ),
                OnBoardingItem(
                    onBoardingImage = R.drawable.delivers,
                    title = "Fast Delivery",
                    description = "We deliver your products as soon as possible."
                ),
                OnBoardingItem(
                    onBoardingImage = R.drawable.cart,
                    title = "Easy Shopping Cart",
                    description = "ShopMood offers easy shopping carts.Don't stop! Shop , catch your mood!"
                )
            )
        )
        val onboargingViewPager = findViewById<ViewPager2>(R.id.onboardingViewPager)
        onboargingViewPager.adapter = onboardingItemsAdapter
        onboargingViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
            }
        })
        (onboargingViewPager.getChildAt(0) as RecyclerView).overScrollMode =
            RecyclerView.OVER_SCROLL_NEVER
        findViewById<ImageView>(R.id.imageNext).setOnClickListener{
            if(onboargingViewPager.currentItem + 1 < onboardingItemsAdapter.itemCount){
                onboargingViewPager.currentItem += 1
            }else{navigateToHomeActivity()
            }
        }
        findViewById<TextView>(R.id.textSkip).setOnClickListener{
            navigateToHomeActivity()
        }
        findViewById<MaterialButton>(R.id.buttonGetStarted).setOnClickListener{
            navigateToHomeActivity()
        }
    }



    private fun navigateToHomeActivity() {
        startActivity(Intent(applicationContext, SignInActivity::class.java))
        finish()
    }


    private fun setupIndicators() {
        indicatorsContrainer = findViewById(R.id.indicatorsContainer)
        val indicators = arrayOfNulls<ImageView>(onboardingItemsAdapter.itemCount)
        val layoutParams : LinearLayout.LayoutParams =
            LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        layoutParams.setMargins(8, 0, 8, 0)
        for(i in indicators.indices) {
            indicators[i] = ImageView(applicationContext)
            indicators[i]?.let {
                it.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive_background
                    )
                )
                it.layoutParams = layoutParams
                indicatorsContrainer.addView(it)
            }
        }
    }

    private fun setCurrentIndicator(position: Int){
        val childCount = indicatorsContrainer.childCount
        for(i in 0 until childCount) {
            val imageView = indicatorsContrainer.getChildAt(i) as ImageView
            if(i == position) {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_active_background
                    )
                )
            } else {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive_background
                    )
                )
            }
        }
    }
}
