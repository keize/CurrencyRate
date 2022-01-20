package com.example.currencyrate.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencyrate.data.repository.Repository
import com.example.currencyrate.model.cash.CashModel
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel: ViewModel() {

    var repo = Repository()
    val moneyList: MutableLiveData<Response<CashModel>> = MutableLiveData()

    fun getCashMoney() {
        viewModelScope.launch {
            moneyList.value = repo.getNal()
        }
    }



}