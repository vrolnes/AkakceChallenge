package com.example.akakcechallenge.feature.detailScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.akakcechallenge.data.DetailScreenResult
import com.example.akakcechallenge.network.API
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class DetailViewModel : ViewModel() {
    fun getDetailScreen(code: String): DetailScreenResult? {
        var result: DetailScreenResult? = null
        viewModelScope.launch {
            runBlocking {
                result = API.retrofitService.getDetailPage(code)
            }
        }
        return result
    }
}