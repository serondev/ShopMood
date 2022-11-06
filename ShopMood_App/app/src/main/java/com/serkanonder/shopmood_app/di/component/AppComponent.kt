package com.serkanonder.shopmood_app.di.component

import android.content.Context
import com.serkanonder.shopmood_app.MainActivity
import com.serkanonder.shopmood_app.MenuActivity
import com.serkanonder.shopmood_app.ShopMood
import com.serkanonder.shopmood_app.di.module.AppModule
import com.serkanonder.shopmood_app.di.module.DataModule
import com.serkanonder.shopmood_app.di.module.RemoteModule
import com.serkanonder.shopmood_app.di.module.ViewModelsModule
import com.serkanonder.shopmood_app.presentation.products.view.ProductsFragment
import com.serkanonder.shopmood_app.presentation.productsdetils.view.DetailsFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component (
    modules = [
        AppModule::class,
        RemoteModule::class,
        DataModule::class,
        ViewModelsModule::class
    ]
)
interface AppComponent {

    fun inject(app: ShopMood)

    fun inject(mainActivity: MainActivity)

    fun inject(fragment: ProductsFragment)

    // Add bindings for your dependent components here.

    @Component.Factory
    interface Factory { // This is where you define your app's dependencies.
        fun create(@BindsInstance applicationContext: Context): AppComponent //
    } // You can then use this factory to create an instance of your AppComponent anywhere you need it.
} //End of AppComponent