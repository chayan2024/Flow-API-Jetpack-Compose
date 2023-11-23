package com.withjetpack.flow_api_jetpack_compose.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.withjetpack.flow_api_jetpack_compose.model.ListItemData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

// ViewModel class
class ListViewDataModel : ViewModel() {

    private val _listData = MutableStateFlow<List<ListItemData>>(emptyList())
    val listData: StateFlow<List<ListItemData>> = _listData

    init {
        // Simulate loading data
        viewModelScope.launch {
            _listData.value = listOf(
                ListItemData(1, "Item 1"),
                ListItemData(2, "Item 2"),
                ListItemData(3, "Item 3"),
                // Add more items as needed
            )
        }
    }
}