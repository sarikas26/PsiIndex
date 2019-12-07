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
class RegionMetadataTest {

    @Mock
    lateinit var regionMetadata: RegionMetadata
    private var testData: PsiResponse? = null

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        testData = TestUtils.getResponseData(javaClass)
    }

    @Test
    fun tesName_success() {
        Mockito.`when`(regionMetadata.name).thenReturn("west")
        Assert.assertEquals("west", regionMetadata.name)
    }

    @Test
    fun tesName_error() {
        Mockito.`when`(regionMetadata.name).thenReturn("west")
        Assert.assertNotEquals("east", regionMetadata.name)
    }

    @Test
    fun testLabelLocation_success() {
        Mockito.`when`(regionMetadata.label_location)
            .thenReturn(testData?.region_metadata!![0].label_location)
        Assert.assertEquals(
            testData?.region_metadata!![0].label_location,
            regionMetadata.label_location
        )
    }

    @Test
    fun testLabelLocation_error() {
        Mockito.`when`(regionMetadata.label_location)
            .thenReturn(testData?.region_metadata!![0].label_location)
        Assert.assertNotEquals("", regionMetadata.label_location)
    }
}