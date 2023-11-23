package com.withjetpack.flow_api_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.withjetpack.flow_api_jetpack_compose.presentation.ListScreen
import com.withjetpack.flow_api_jetpack_compose.ui.theme.FlowAPIJetpackComposeTheme
import com.withjetpack.flow_api_jetpack_compose.viewmodel.ListViewDataModel

class MainActivity : ComponentActivity() {
    private val viewModel: ListViewDataModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlowAPIJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ListScreen(viewModel = viewModel)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FlowAPIJetpackComposeTheme {
        Greeting("Android")
    }
}