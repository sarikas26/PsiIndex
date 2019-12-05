package com.capgemini.sarikin.psiindex.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.capgemini.sarikin.psiindex.api.SchedulerProvider
import com.capgemini.sarikin.psiindex.model.PsiResponse
import com.capgemini.sarikin.psiindex.repository.PsiDataRepository
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by Sarika Singh
 */
class PsiDataViewModel(
    private val repository: PsiDataRepository,
    private val schedulerProvider: SchedulerProvider
) : ViewModel() {

    private val compositeDisposable by lazy { CompositeDisposable() }
    private var psiData = MutableLiveData<PsiResponse>()
    private var progressDialog = MutableLiveData<Boolean>()
    private var errorMsg = MutableLiveData<String>()

    /**
     * Call api from repository class.
     */
    fun fetchDataFromApi() {
        progressDialog.value = true
        compositeDisposable.add(
            repository.fetchDataFromApi()
                .compose(schedulerProvider.getSchedulersForSingle())
                .subscribe(this::onSuccess, this::onError)
        )
    }

    /**
     * Handle api success.
     */
    private fun onSuccess(psiResponse: PsiResponse) {
        progressDialog.value = false
        if (psiResponse.region_metadata.isEmpty()) {
            errorMsg.postValue("No data available currently")
        } else {
            psiData.postValue(psiResponse)
        }
        Log.d("MainActivity", psiResponse.region_metadata[0].name)
    }

    /**
     * Handle api error.
     */
    private fun onError(error: Throwable) {
        progressDialog.value = false
        errorMsg.postValue(error.message)
        Log.d("MainActivity", error.message)
    }

    /**
     * Provide api response data.
     */
    fun getResponseData(): MutableLiveData<PsiResponse> {
        return psiData
    }

    /**
     * Provide progress dialog status.
     */
    fun getProgressDialog(): MutableLiveData<Boolean> {
        return progressDialog
    }

    /**
     * Provide api error message string.
     */
    fun getErrorMsg(): MutableLiveData<String> {
        return errorMsg
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
        compositeDisposable.dispose()
    }

}