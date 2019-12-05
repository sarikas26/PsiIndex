package com.capgemini.sarikin.psiindex.repository

import com.capgemini.sarikin.psiindex.api.ApiService
import com.capgemini.sarikin.psiindex.model.PsiResponse
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Sarika Singh
 *
 * Repository class to make api call to get Psi Index data
 */
@Singleton
class PsiDataRepository @Inject constructor(private val apiService: ApiService) {

    fun fetchDataFromApi(): Single<PsiResponse> = apiService.getPsiResponse()
}