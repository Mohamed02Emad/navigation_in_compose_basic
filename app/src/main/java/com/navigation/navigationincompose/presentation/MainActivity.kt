package com.navigation.navigationincompose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.navigation.navigationincompose.ui.theme.Navigation_in_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation_in_composeTheme {
                Navigation(
                    Modifier
                        .fillMaxSize()
                        .background(Color.White)
                )
            }
        }
    }
}
