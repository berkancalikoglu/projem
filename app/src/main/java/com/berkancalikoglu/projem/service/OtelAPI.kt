package com.berkancalikoglu.projem.service

import com.berkancalikoglu.projem.model.Otel
import io.reactivex.Single
import retrofit2.http.GET

interface OtelAPI {

     // atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json
    //otel.json
    @GET("atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json")
    fun getOtels(): Single<List<Otel>>
}