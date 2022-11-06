package com.serkanonder.shopmood_app.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

class ViewModelProviderFactory @Inject constructor(
    private val creators: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val creator = creators[modelClass] ?: creators.entries.firstOrNull {
            modelClass.isAssignableFrom(it.key) // if the ViewModel is a subclass of the key
        }?.value ?: throw IllegalArgumentException("unknown model class $modelClass") // if the ViewModel is not found in the map
        try {
            @Suppress("UNCHECKED_CAST")
            return creator.get() as T
        } catch (e: Exception) { // if the ViewModel cannot be created
            throw RuntimeException(e) // throw an exception
        }
    }
}
