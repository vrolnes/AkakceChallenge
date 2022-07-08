package com.example.akakcechallenge.feature.mainScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.akakcechallenge.data.MainResult
import com.example.akakcechallenge.network.API
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainViewModel : ViewModel() {
    fun getMainScreen(): MainResult? {
        var result: MainResult? = null
        viewModelScope.launch {
            runBlocking {
                result = API.retrofitService.getMainPage()
            }
        }
        return result
    }
}