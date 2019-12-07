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
class ReadingDetailsTest {

    @Mock
    lateinit var readingDetails: ReadingDetails

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun westTest_success() {
        Mockito.`when`(readingDetails.west).thenReturn("12")
        Assert.assertEquals("12", readingDetails.west)
    }

    @Test
    fun westTest_error() {
        Mockito.`when`(readingDetails.west).thenReturn("12")
        Assert.assertNotEquals("2", readingDetails.west)
    }

    @Test
    fun eastTest_success() {
        Mockito.`when`(readingDetails.east).thenReturn("11")
        Assert.assertEquals("11", readingDetails.east)
    }

    @Test
    fun eastTest_error() {
        Mockito.`when`(readingDetails.east).thenReturn("11")
        Assert.assertNotEquals("2", readingDetails.east)
    }

    @Test
    fun northTest_success() {
        Mockito.`when`(readingDetails.north).thenReturn("0.37")
        Assert.assertEquals("0.37", readingDetails.north)
    }

    @Test
    fun northTest_error() {
        Mockito.`when`(readingDetails.north).thenReturn("0.37")
        Assert.assertNotEquals("2", readingDetails.north)
    }

    @Test
    fun southTest_success() {
        Mockito.`when`(readingDetails.south).thenReturn("12")
        Assert.assertEquals("12", readingDetails.south)
    }

    @Test
    fun southTest_error() {
        Mockito.`when`(readingDetails.south).thenReturn("12")
        Assert.assertNotEquals("21", readingDetails.south)
    }

    @Test
    fun centralTest_success() {
        Mockito.`when`(readingDetails.central).thenReturn("0.12")
        Assert.assertEquals("0.12", readingDetails.central)
    }

    @Test
    fun centralTest_error() {
        Mockito.`when`(readingDetails.central).thenReturn("0.12")
        Assert.assertNotEquals("12", readingDetails.central)
    }

    @Test
    fun nationalTest_success() {
        Mockito.`when`(readingDetails.national).thenReturn("11")
        Assert.assertEquals("11", readingDetails.national)
    }

    @Test
    fun nationalTest_error() {
        Mockito.`when`(readingDetails.national).thenReturn("11")
        Assert.assertNotEquals("12", readingDetails.national)
    }
}