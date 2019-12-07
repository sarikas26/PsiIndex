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
class LabelLocationTest {

    @Mock
    lateinit var labelLocation: LabelLocation

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun testLabelLocationLatitude_success() {
        Mockito.`when`(labelLocation.latitude).thenReturn(1.35735)
        Assert.assertEquals(1.35735, labelLocation.latitude, 0.0)
    }

    @Test
    fun testLabelLocationLatitude_error() {
        Mockito.`when`(labelLocation.latitude).thenReturn(1.35735)
        Assert.assertNotEquals(1.3, labelLocation.latitude, 0.0)
    }

    @Test
    fun testLabelLocationLongitude_success() {
        Mockito.`when`(labelLocation.latitude).thenReturn(103.7)
        Assert.assertEquals(103.7, labelLocation.latitude, 0.0)
    }

    @Test
    fun testLabelLocationLongitude_error() {
        Mockito.`when`(labelLocation.latitude).thenReturn(103.7)
        Assert.assertNotEquals(10.7, labelLocation.latitude, 0.0)
    }
}