package com.example.currencyrate.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencyrate.data.repository.Repository
import com.example.currencyrate.model.cash.CashModel
import com.example.currencyrate.model.cashless.CashlessModel
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel(){

    var repo = Repository()
    val moneyList: MutableLiveData<Response<CashlessModel>> = MutableLiveData()

    fun getCashlessMoney() {
        viewModelScope.launch {
            moneyList.value = repo.getBezNal()
        }
    }


}