package com.example.akakcechallenge.feature.mainScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.akakcechallenge.data.MainResult
import com.example.akakcechallenge.network.API
import com.example.akakcechallenge.network.ApiService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val apiService: ApiService) : ViewModel() {
    fun getMainScreen(): MainResult? {
        var result: MainResult? = null
        viewModelScope.launch {
            runBlocking {
                result = apiService.getMainPage()
            }
        }
        return result
    }
}