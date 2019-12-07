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
class ItemsTest {

    @Mock
    lateinit var items: Items

    private var testData: PsiResponse? = null

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        testData = TestUtils.getResponseData(javaClass)
    }

    @Test
    fun testTimeStamp_success() {
        Mockito.`when`(items.timestamp).thenReturn("2019-12-04T08:00:00+08:00")
        Assert.assertEquals("2019-12-04T08:00:00+08:00", items.timestamp)
    }

    @Test
    fun testTimeStamp_error() {
        Mockito.`when`(items.timestamp).thenReturn("2019-12-04T08:00:00+08:00")
        Assert.assertNotEquals("2019-12-14T08:00:00+08:00", items.timestamp)
    }

    @Test
    fun testUpdateTimeStamp_success() {
        Mockito.`when`(items.update_timestamp).thenReturn("2019-12-04T08:03:52+08:00")
        Assert.assertEquals("2019-12-04T08:03:52+08:00", items.update_timestamp)
    }

    @Test
    fun testUpdateTimeStamp_error() {
        Mockito.`when`(items.update_timestamp).thenReturn("2019-12-04T08:03:52+08:00")
        Assert.assertNotEquals("2019-12-14T08:03:52+08:00", items.update_timestamp)
    }

    @Test
    fun testReadings_success() {
        Mockito.`when`(items.readings).thenReturn(testData?.items!![0].readings)
        Assert.assertEquals(testData?.items!![0].readings, items.readings)
    }

    @Test
    fun testReadings_error() {
        Mockito.`when`(items.readings).thenReturn(testData?.items!![0].readings)
        Assert.assertNotEquals(null, items.readings)
    }
}