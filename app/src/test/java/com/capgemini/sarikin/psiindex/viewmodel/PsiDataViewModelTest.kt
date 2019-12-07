package com.capgemini.sarikin.psiindex.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.capgemini.sarikin.psiindex.TestUtils
import com.capgemini.sarikin.psiindex.api.SchedulerProvider
import com.capgemini.sarikin.psiindex.model.PsiResponse
import com.capgemini.sarikin.psiindex.repository.PsiDataRepository
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

/**
 * Created by Sarika Singh
 */
@RunWith(JUnit4::class)
class PsiDataViewModelTest {

    @Rule
    @JvmField
    val instantExecutorRule = InstantTaskExecutorRule()
    @Mock
    private lateinit var mockRepository: PsiDataRepository
    @Mock
    lateinit var responseObserver: Observer<PsiResponse>
    @Mock
    lateinit var errorObserver: Observer<String>
    @Mock
    lateinit var progressObserver: Observer<Boolean>

    private var testData: PsiResponse? = null

    private val schedulerProvider =
        SchedulerProvider(Schedulers.trampoline(), Schedulers.trampoline())

    private lateinit var PsiDataViewModel: PsiDataViewModel

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        PsiDataViewModel = PsiDataViewModel(mockRepository, schedulerProvider)
        PsiDataViewModel.getResponseData().observeForever(responseObserver)
        PsiDataViewModel.getErrorMsg().observeForever(errorObserver)
        PsiDataViewModel.getProgressDialog().observeForever(progressObserver)
        testData = TestUtils.getResponseData(javaClass)
    }

    @Test
    fun testApiFetchData_null() {
        Mockito.`when`(mockRepository.fetchDataFromApi()).thenReturn(null)
        Assert.assertNotNull(PsiDataViewModel.getResponseData())
        Assert.assertTrue(PsiDataViewModel.getResponseData().hasObservers())
    }

    @Test
    fun testApiFetchData_Success() {
        Mockito.`when`(mockRepository.fetchDataFromApi()).thenReturn(Single.just(testData))
        PsiDataViewModel.fetchDataFromApi()
        Mockito.verify(progressObserver).onChanged(false)
        Mockito.verify(responseObserver).onChanged(testData)
    }

    @Test
    fun testApiFetchData_Error() {
        Mockito.`when`(mockRepository.fetchDataFromApi())
            .thenReturn(Single.error(Throwable("Error")))
        PsiDataViewModel.fetchDataFromApi()
        Mockito.verify(progressObserver).onChanged(false)
        Mockito.verify(errorObserver).onChanged("Error")
    }
}