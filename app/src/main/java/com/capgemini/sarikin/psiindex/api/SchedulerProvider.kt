package com.capgemini.sarikin.psiindex.api

import io.reactivex.Scheduler
import io.reactivex.Single

/**
 * Created by Sarika Singh
 *
 * Class to create schedulers.
 */
class SchedulerProvider(private val backgroundScheduler: Scheduler, private val foregroundScheduler: Scheduler) {

    /**
     * method to create scheduler for Single
     */
    fun <T> getSchedulersForSingle(): (Single<T>) -> Single<T> {
        return { single: Single<T> ->
            single.subscribeOn(backgroundScheduler)
                .observeOn(foregroundScheduler)
        }
    }
}