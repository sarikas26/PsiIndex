package com.capgemini.sarikin.psiindex.model

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

/**
 * Created by Sarika Singh
 */
class ReadingsTest {

    @Mock
    lateinit var readings: Readings

    private var testData1 = ReadingDetails("12", "13", "41", "21", "32", "13")
    private var testData2 = ReadingDetails("0.11", "13", "11", "21", "32", "13")
    private var testData3 = ReadingDetails("12", "13", "63", "11", "11", "31")

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun testo3_sub_index_success() {
        Mockito.`when`(readings.o3_sub_index).thenReturn(testData1)
        Assert.assertEquals(testData1, readings.o3_sub_index)
    }

    @Test
    fun testo3_sub_index_error() {
        Mockito.`when`(readings.o3_sub_index).thenReturn(testData1)
        Assert.assertNotEquals(testData2, readings.o3_sub_index)
    }

    @Test
    fun testopm10_twenty_four_hourly_success() {
        Mockito.`when`(readings.pm10_twenty_four_hourly).thenReturn(testData2)
        Assert.assertEquals(testData2, readings.pm10_twenty_four_hourly)
    }

    @Test
    fun testopm10_twenty_four_hourly_error() {
        Mockito.`when`(readings.pm10_twenty_four_hourly).thenReturn(testData2)
        Assert.assertNotEquals(testData1, readings.pm10_twenty_four_hourly)
    }

    @Test
    fun testpm10_sub_index_success() {
        Mockito.`when`(readings.pm10_sub_index).thenReturn(testData3)
        Assert.assertEquals(testData3, readings.pm10_sub_index)
    }

    @Test
    fun testpm10_sub_index_error() {
        Mockito.`when`(readings.pm10_sub_index).thenReturn(testData1)
        Assert.assertNotEquals(testData3, readings.pm10_sub_index)
    }

    @Test
    fun testoco_sub_index_success() {
        Mockito.`when`(readings.co_sub_index).thenReturn(testData3)
        Assert.assertEquals(testData3, readings.co_sub_index)
    }

    @Test
    fun testoco_sub_index_error() {
        Mockito.`when`(readings.co_sub_index).thenReturn(testData3)
        Assert.assertNotEquals(testData1, readings.co_sub_index)
    }

    @Test
    fun testopm25_twenty_four_hourly_success() {
        Mockito.`when`(readings.pm25_twenty_four_hourly).thenReturn(testData2)
        Assert.assertEquals(testData2, readings.pm25_twenty_four_hourly)
    }

    @Test
    fun testopm25_twenty_four_hourly_error() {
        Mockito.`when`(readings.pm25_twenty_four_hourly).thenReturn(testData2)
        Assert.assertNotEquals(testData1, readings.pm25_twenty_four_hourly)
    }

    @Test
    fun testoso2_sub_index_success() {
        Mockito.`when`(readings.so2_sub_index).thenReturn(testData1)
        Assert.assertEquals(testData1, readings.so2_sub_index)
    }

    @Test
    fun testoso2_sub_index_error() {
        Mockito.`when`(readings.so2_sub_index).thenReturn(testData1)
        Assert.assertNotEquals(testData3, readings.so2_sub_index)
    }

    @Test
    fun testco_eight_hour_max_success() {
        Mockito.`when`(readings.co_eight_hour_max).thenReturn(testData2)
        Assert.assertEquals(testData2, readings.co_eight_hour_max)
    }

    @Test
    fun testco_eight_hour_max_error() {
        Mockito.`when`(readings.co_eight_hour_max).thenReturn(testData2)
        Assert.assertNotEquals(testData3, readings.co_eight_hour_max)
    }

    @Test
    fun testno2_one_hour_max_success() {
        Mockito.`when`(readings.no2_one_hour_max).thenReturn(testData3)
        Assert.assertEquals(testData3, readings.no2_one_hour_max)
    }

    @Test
    fun testno2_one_hour_max_error() {
        Mockito.`when`(readings.no2_one_hour_max).thenReturn(testData3)
        Assert.assertNotEquals(testData1, readings.no2_one_hour_max)
    }

    @Test
    fun testso2_twenty_four_hourly_success() {
        Mockito.`when`(readings.so2_twenty_four_hourly).thenReturn(testData1)
        Assert.assertEquals(testData1, readings.so2_twenty_four_hourly)
    }

    @Test
    fun testso2_twenty_four_hourly_error() {
        Mockito.`when`(readings.so2_twenty_four_hourly).thenReturn(testData1)
        Assert.assertNotEquals(testData3, readings.so2_twenty_four_hourly)
    }

    @Test
    fun testpm25_sub_index_success() {
        Mockito.`when`(readings.pm25_sub_index).thenReturn(testData2)
        Assert.assertEquals(testData2, readings.pm25_sub_index)
    }

    @Test
    fun testpm25_sub_index_error() {
        Mockito.`when`(readings.pm25_sub_index).thenReturn(testData2)
        Assert.assertNotEquals(testData1, readings.pm25_sub_index)
    }

    @Test
    fun testopsi_twenty_four_hourly_success() {
        Mockito.`when`(readings.psi_twenty_four_hourly).thenReturn(testData1)
        Assert.assertEquals(testData1, readings.psi_twenty_four_hourly)
    }

    @Test
    fun testopsi_twenty_four_hourly_error() {
        Mockito.`when`(readings.psi_twenty_four_hourly).thenReturn(testData1)
        Assert.assertNotEquals(testData2, readings.psi_twenty_four_hourly)
    }

    @Test
    fun testo3_eight_hour_max_success() {
        Mockito.`when`(readings.o3_eight_hour_max).thenReturn(testData3)
        Assert.assertEquals(testData3, readings.o3_eight_hour_max)
    }

    @Test
    fun testo3_eight_hour_max_error() {
        Mockito.`when`(readings.o3_eight_hour_max).thenReturn(testData3)
        Assert.assertNotEquals(testData1, readings.o3_eight_hour_max)
    }
}