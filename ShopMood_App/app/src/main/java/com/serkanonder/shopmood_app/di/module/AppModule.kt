package com.serkanonder.shopmood_app.di.module

import com.serkanonder.shopmood_app.utils.Constant.BASE_URL
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton // Singleton annotation is used to create only one instance of the object
    @Provides // Dagger will only look for methods annotated with @Provides
    fun createOkHttpClient(): OkHttpClient { // This method will provide the OkHttpClient object
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder() // OkHttpClient.Builder() is used to create the OkHttpClient object
            .connectTimeout(2, TimeUnit.MINUTES)
            .readTimeout(2, TimeUnit.MINUTES)
            .addInterceptor(logging)
            .build()
    }

    @Singleton
    @Provides
    fun providesRetrofit(okHttpClient: OkHttpClient): Retrofit { // This method will provide the Retrofit object
        return Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create()) // GsonConverterFactory is used to serialize the JSON data
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create()) // RxJava3CallAdapterFactory is used to create the Observable object
            .baseUrl(BASE_URL) // BASE_URL is the base url of the API
            .build() // build() method is used to create the Retrofit object
    } // providesRetrofit() method will return the Retrofit object
}
