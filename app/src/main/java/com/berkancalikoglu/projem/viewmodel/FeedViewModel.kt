package com.berkancalikoglu.projem.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.berkancalikoglu.projem.model.Otel
import com.berkancalikoglu.projem.service.OtelAPIService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class FeedViewModel : ViewModel() {

    private val otelApiService = OtelAPIService()
    private val disposable = CompositeDisposable()

    val otels = MutableLiveData<List<Otel>>()
    val otelError = MutableLiveData<Boolean>()
    val otelLoading = MutableLiveData<Boolean>()

    fun refreshData() {
        getDataFromAPI()
    }
    fun refreshFromAPI() {
        getDataFromAPI()
    }

    private fun getDataFromAPI() {
        otelLoading.value = true

        disposable.add(
            otelApiService.getData()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<List<Otel>>(){
                    override fun onSuccess(t: List<Otel>) {

                        otels.value = t
                        otelError.value = false
                        otelLoading.value = false
                    }

                    override fun onError(e: Throwable) {

                        otelLoading.value = false
                        otelError.value = true
                    }
                })
        )
    }
}