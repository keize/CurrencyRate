package com.example.currencyrate.data.repository

import com.example.currencyrate.data.api.ApiService
import com.example.currencyrate.data.api.RetrofitInstance
import com.example.currencyrate.model.cash.CashModel
import com.example.currencyrate.model.cash.CashModelItem
import com.example.currencyrate.model.cashless.CashlessModel
import com.example.currencyrate.model.cashless.CashlessModelItem
import retrofit2.Response

class Repository {

    suspend fun getNal(): Response<CashModel> {
        return RetrofitInstance.apiService.getCash()

    }

    suspend fun getBezNal(): Response<CashlessModel> {
        return RetrofitInstance.apiService.getCashless()

    }
}