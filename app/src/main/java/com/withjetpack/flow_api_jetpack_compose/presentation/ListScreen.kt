package com.withjetpack.flow_api_jetpack_compose.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.withjetpack.flow_api_jetpack_compose.viewmodel.ListViewDataModel

@Composable
fun ListScreen(viewModel: ListViewDataModel) {
    val list by viewModel.listData.collectAsState()

    LazyColumn {
        items(list) { item ->
            Text(text = item.text, modifier = Modifier.padding(16.dp))
        }
    }
}