package com.example.currencyrate.data.api

import com.example.currencyrate.model.cash.CashModel
import com.example.currencyrate.model.cash.CashModelItem
import com.example.currencyrate.model.cashless.CashlessModel
import com.example.currencyrate.model.cashless.CashlessModelItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getCash() : Response<CashModel>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getCashless() : Response<CashlessModel>
}