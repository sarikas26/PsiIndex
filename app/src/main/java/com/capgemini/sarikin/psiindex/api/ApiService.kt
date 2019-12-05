package com.capgemini.sarikin.psiindex.api

import com.capgemini.sarikin.psiindex.model.PsiResponse
import io.reactivex.Single
import retrofit2.http.GET

/**
 * Created by Sarika Singh
 */
interface ApiService {

    @GET("psi")
    fun getPsiResponse() : Single<PsiResponse>
}