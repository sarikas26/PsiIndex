package com.capgemini.sarikin.psiindex.di.component

import android.app.Application
import com.capgemini.sarikin.psiindex.PsiIndexApplication
import com.capgemini.sarikin.psiindex.di.ActivityBuilder
import com.capgemini.sarikin.psiindex.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by Sarika Singh
 */
@Singleton
@Component(modules = [AndroidInjectionModule::class, NetworkModule::class, ActivityBuilder::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder
        fun build(): AppComponent
    }

    fun inject(app: PsiIndexApplication)
}