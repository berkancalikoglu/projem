package com.berkancalikoglu.projem.service

import com.berkancalikoglu.projem.model.Otel
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class OtelAPIService {

    //https://raw.githubusercontent.com/
    //http://www.ipucubilisim.com.tr/
    private val BASE_URL = "https://raw.githubusercontent.com/"
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(OtelAPI::class.java)

    fun getData() : Single<List<Otel>> {
        return api.getOtels()
    }
}