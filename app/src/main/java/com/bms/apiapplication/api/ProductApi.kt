package com.bms.apiapplication.api

import com.bms.apiapplication.model.Product
import retrofit2.Call
import retrofit2.http.GET


interface ProductApi {

    @GET("getdata.php")
    fun getProductApi(): Call<List<Product>>

}