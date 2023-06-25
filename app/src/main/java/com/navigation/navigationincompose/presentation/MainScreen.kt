package com.navigation.navigationincompose.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun MainScreen(modifier: Modifier,navController: NavController) {

    var text1 by remember {
        mutableStateOf("0")
    }

    Box(modifier) {
        Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Box() {
                Row(
                    Modifier
                        .padding(16.dp, 0.dp)
                        .align(Alignment.Center), verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(modifier = Modifier.wrapContentSize()) {
                        Text(
                            text = "enter number :",
                            color = Color.Black,
                            fontSize = 18.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                    TextField(
                        value = text1, onValueChange = { text ->
                            text1 = text.toString()
                        },
                        Modifier
                            .padding(8.dp, 0.dp, 0.dp, 0.dp)
                            .fillMaxWidth()
                    )
                }
            }
            Spacer(modifier = Modifier.height(40.dp))
            Box() {
                Button(
                    onClick = {
                      navController.navigate("second_screen/$text1")
                    },
                ) {
                    Box() {
                        Text(
                            text = "Navigate",
                            color = Color.White,
                            fontSize = 18.sp, textAlign = TextAlign.Center,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
            }
        }
    }

}
