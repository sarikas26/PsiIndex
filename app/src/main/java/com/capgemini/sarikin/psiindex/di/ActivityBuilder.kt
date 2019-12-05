package com.capgemini.sarikin.psiindex.di

import com.capgemini.sarikin.psiindex.di.module.PsiDataModule
import com.capgemini.sarikin.psiindex.ui.activities.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Sarika Singh
 */
@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [PsiDataModule::class])
    abstract fun bindMainActivity(): MainActivity
}