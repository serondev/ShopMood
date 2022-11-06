package com.serkanonder.shopmood_app.di

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@MustBeDocumented // Annotation class must be documented
@Target(AnnotationTarget.FUNCTION) // AnnotationTarget.FUNCTION: Annotation is allowed on functions
@Retention(AnnotationRetention.RUNTIME) // AnnotationRetention.RUNTIME: Annotation is stored in the .class file and is available at runtime
@MapKey // Annotation is used to create a Map of ViewModel classes and their corresponding ViewModel instances
annotation class ViewModelKey(val value: KClass<out ViewModel>)  // Annotation class that takes a KClass as a parameter

