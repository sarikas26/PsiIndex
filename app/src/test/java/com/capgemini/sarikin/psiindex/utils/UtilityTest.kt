package com.capgemini.sarikin.psiindex.utils

import com.capgemini.sarikin.psiindex.TestUtils
import com.capgemini.sarikin.psiindex.constants.PsiAppConstants
import com.capgemini.sarikin.psiindex.model.PsiResponse
import com.capgemini.sarikin.psiindex.model.ReadingDetailsPair
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.MockitoAnnotations

/**
 * Created by Sarika Singh
 */
class UtilityTest {

    private var testData: PsiResponse? = null

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        testData = TestUtils.getResponseData(javaClass)
    }

    @Test
    fun getRegionTitleTest_success() {
        val testString = "Click to see Psi Index details for : west"
        Assert.assertEquals("west", Utility.getRegionTitle(testString))
    }

    @Test
    fun getRegionTitleTest_null_title_failure() {
        val testString = null
        Assert.assertNotEquals("west", Utility.getRegionTitle(testString))
    }

    @Test
    fun getRegionTitleTest_empty_title_failure() {
        val testString = "Click to see Psi Index details for : "
        Assert.assertNotEquals("west", Utility.getRegionTitle(testString))
    }

    @Test
    fun getReadingDetailsTest_success() {
        Assert.assertEquals(
            createTestData1(),
            Utility.getReadingDetails(testData?.items!![0].readings, "east")
        )
    }

    @Test
    fun getReadingDetailsTest_null_identifier() {
        Assert.assertNotEquals(
            createTestData1(),
            Utility.getReadingDetails(testData?.items!![0].readings, null)
        )
    }

    @Test
    fun getReadingDetailsTest_failure() {
        Assert.assertNotEquals(
            createTestData2(),
            Utility.getReadingDetails(testData?.items!![0].readings, "east")
        )
    }

    @Test
    fun getEastReadingTest_success() {
        Assert.assertEquals(
            createTestData1(),
            Utility.getEastReadings(testData?.items!![0].readings)
        )
    }

    @Test
    fun getEastReadingTest_fail() {
        Assert.assertNotEquals(
            createTestData2(),
            Utility.getEastReadings(testData?.items!![0].readings)
        )
    }

    @Test
    fun getWestReadingTest_success() {
        Assert.assertEquals(
            createTestData1(),
            Utility.getWestReadings(testData?.items!![0].readings)
        )
    }

    @Test
    fun getWestReadingTest_fail() {
        Assert.assertNotEquals(
            createTestData2(),
            Utility.getWestReadings(testData?.items!![0].readings)
        )
    }

    @Test
    fun getNorthReadingTest_success() {
        Assert.assertEquals(
            createTestData1(),
            Utility.getNorthReadings(testData?.items!![0].readings)
        )
    }

    @Test
    fun getNorthReadingTest_fail() {
        Assert.assertNotEquals(
            createTestData2(),
            Utility.getNorthReadings(testData?.items!![0].readings)
        )
    }

    @Test
    fun getSouthReadingTest_success() {
        Assert.assertEquals(
            createTestData1(),
            Utility.getSouthReadings(testData?.items!![0].readings)
        )
    }

    @Test
    fun getSouthReadingTest_fail() {
        Assert.assertNotEquals(
            createTestData2(),
            Utility.getSouthReadings(testData?.items!![0].readings)
        )
    }

    @Test
    fun getCentralReadingTest_success() {
        Assert.assertEquals(
            createTestData1(),
            Utility.getCentralReadings(testData?.items!![0].readings)
        )
    }

    @Test
    fun getCentralReadingTest_fail() {
        Assert.assertNotEquals(
            createTestData2(),
            Utility.getCentralReadings(testData?.items!![0].readings)
        )
    }

    private fun createTestData1(): List<ReadingDetailsPair> {
        val readingDetailsPair = ArrayList<ReadingDetailsPair>()
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.co_eight_hour_max, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.co_sub_index, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.no2_one_hour_max, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.o3_eight_hour_max, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.o3_sub_index, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.pm10_sub_index, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.pm10_twenty_four_hourly, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.pm25_sub_index, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.pm25_twenty_four_hourly, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.psi_twenty_four_hourly, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.so2_sub_index, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.so2_twenty_four_hourly, "11"))
        return readingDetailsPair
    }

    private fun createTestData2(): List<ReadingDetailsPair> {
        val readingDetailsPair = ArrayList<ReadingDetailsPair>()
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.co_eight_hour_max, "12"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.co_sub_index, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.no2_one_hour_max, "14"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.o3_eight_hour_max, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.o3_sub_index, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.pm10_sub_index, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.pm10_twenty_four_hourly, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.pm25_sub_index, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.pm25_twenty_four_hourly, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.psi_twenty_four_hourly, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.so2_sub_index, "11"))
        readingDetailsPair.add(ReadingDetailsPair(PsiAppConstants.so2_twenty_four_hourly, "11"))
        return readingDetailsPair
    }
}