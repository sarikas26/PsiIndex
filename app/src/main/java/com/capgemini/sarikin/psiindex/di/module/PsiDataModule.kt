package com.capgemini.sarikin.psiindex.di.module

import com.capgemini.sarikin.psiindex.api.SchedulerProvider
import com.capgemini.sarikin.psiindex.repository.PsiDataRepository
import com.capgemini.sarikin.psiindex.viewmodel.PsiDataViewModel
import dagger.Module
import dagger.Provides

/**
 * Created by Sarika Singh
 */
@Module
class PsiDataModule {

    /**
     * Provide PsiDataViewModel.
     */
    @Provides
    fun providePsiViewModel(repository: PsiDataRepository, schedulerProvider: SchedulerProvider) = PsiDataViewModel(repository, schedulerProvider)
}