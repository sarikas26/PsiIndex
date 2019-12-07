package com.capgemini.sarikin.psiindex.model

import com.capgemini.sarikin.psiindex.TestUtils
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

/**
 * Created by Sarika Singh
 */
class PsiResponseTest {

    @Mock
    lateinit var psiResponse: PsiResponse

    private var testData: PsiResponse? = null

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        testData = TestUtils.getResponseData(javaClass)
    }

    @Test
    fun testRegion_metadata_success() {
        Mockito.`when`(psiResponse.region_metadata).thenReturn(testData?.region_metadata)
        Assert.assertEquals(testData?.region_metadata, psiResponse.region_metadata)
    }

    @Test
    fun testRegion_metadata_error() {
        Mockito.`when`(psiResponse.region_metadata).thenReturn(testData?.region_metadata)
        Assert.assertNotEquals("", psiResponse.region_metadata)
    }

    @Test
    fun tesItems_success() {
        Mockito.`when`(psiResponse.items).thenReturn(testData?.items)
        Assert.assertEquals(testData?.items, psiResponse.items)
    }

    @Test
    fun tesItems_error() {
        Mockito.`when`(psiResponse.items).thenReturn(testData?.items)
        Assert.assertNotEquals("", psiResponse.items)
    }
}