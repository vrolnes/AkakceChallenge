package com.example.akakcechallenge.ui.feature.detailScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.akakcechallenge.models.DetailScreenResult
import com.example.akakcechallenge.api.ApiService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(private val apiService: ApiService) : ViewModel() {
    fun getDetailScreen(code: String): DetailScreenResult? {
        var result: DetailScreenResult? = null
        viewModelScope.launch {
            runBlocking {
                result = apiService.getDetailPage(code)
            }
        }
        return result
    }
}