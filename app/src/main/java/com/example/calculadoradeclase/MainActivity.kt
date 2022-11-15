package com.example.calculadoradeclase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadoradeclase.ui.theme.CalculadoraDeClaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraDeClaseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    CalculadoraContent()
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CalculadoraContent() {
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(15.dp)
            .background(Color.Gray)
    ) {
        Box(
            modifier =
            Modifier
                .fillMaxWidth()
                .weight(2f),
            contentAlignment = Alignment.BottomEnd,
        ) {
            Text(
                text = "0",
                textAlign = TextAlign.End,
                color = Color.White,
                fontSize = 60.sp,
                maxLines = 1,


                )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Black)
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .align(CenterVertically)
                    .fillMaxHeight(1f),

            )
            {
                Text(
                    text = "MC",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "MR",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "M+",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "M-",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "MS",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "M^",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
            }
            /*
            Text("MR", Modifier.weight(1f))
            Text("M+", Modifier.weight(1f))
            Text("M-", Modifier.weight(1f))
            Text("MS", Modifier.weight(1f))
            Text("M^", Modifier.weight(1f))
             */
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .fillMaxHeight(1f),
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .align(CenterVertically)
                    .fillMaxHeight(1f),

                ) {
                Text(
                    text = "1/x",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "x^2",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "√x",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "÷",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(1f),

                ) {
                Text(
                    text = "7",
                    Modifier
                        .weight(1f),
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "8",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "9",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "X",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(1f),

                ) {
                Text(
                    text = "4",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "5",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "6",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "-",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(1f),

                ) {
                Text(
                    text = "1",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "2",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "3",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "+",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(1f),

                ) {
                Text(
                    text = "+/-",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "0",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = ",",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "=",
                    Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

