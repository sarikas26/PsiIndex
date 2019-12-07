package com.capgemini.sarikin.psiindex

import androidx.annotation.Nullable
import com.capgemini.sarikin.psiindex.model.PsiResponse
import com.google.gson.Gson
import org.json.JSONException
import org.json.JSONObject
import org.junit.Before
import org.mockito.MockitoAnnotations
import java.io.IOException

/**
 * Created by Sarika Singh
 *
 * Utility Class to read json data from sample json class to provide test data.
 */
object TestUtils {

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Nullable
    @Throws(IOException::class)
    fun readJsonFile(cls: Class<*>, fileName: String): String? {
        val json: String
        try {
            val inputStream = cls.classLoader?.getResourceAsStream(fileName)
            val size = inputStream!!.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer)
        } catch (ex: IOException) {
            ex.printStackTrace()
            return null
        }

        return json
    }

    fun getResponseData(cls: Class<*>): PsiResponse? {
        try {
            val response = readJsonFile(cls, "psiResponse.json")
            val jsonObject = JSONObject(response)
            return Gson().fromJson(
                jsonObject.toString(),
                PsiResponse::class.java
            )
        } catch (e: JSONException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }

        return null
    }
}