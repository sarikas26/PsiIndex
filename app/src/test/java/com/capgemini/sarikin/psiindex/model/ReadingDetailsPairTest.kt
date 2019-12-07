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
class ReadingDetailsPairTest {

    @Mock
    lateinit var readingDetailsPair: ReadingDetailsPair

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun tesName_success() {
        Mockito.`when`(readingDetailsPair.title).thenReturn("o3_sub_index")
        Assert.assertEquals("o3_sub_index", readingDetailsPair.title)
    }

    @Test
    fun tesName_error() {
        Mockito.`when`(readingDetailsPair.title).thenReturn("o3_sub_index")
        Assert.assertNotEquals("o3_sub_index_", readingDetailsPair.title)
    }

    @Test
    fun testValue_success() {
        Mockito.`when`(readingDetailsPair.value).thenReturn("41")
        Assert.assertEquals("41", readingDetailsPair.value)
    }

    @Test
    fun testValue_error() {
        Mockito.`when`(readingDetailsPair.value).thenReturn("41")
        Assert.assertNotEquals("14", readingDetailsPair.value)
    }
}