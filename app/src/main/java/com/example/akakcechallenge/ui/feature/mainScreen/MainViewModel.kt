package com.example.akakcechallenge.ui.feature.mainScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.akakcechallenge.models.MainResult
import com.example.akakcechallenge.api.ApiService
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