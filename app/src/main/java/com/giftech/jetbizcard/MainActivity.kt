package com.giftech.jetbizcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giftech.jetbizcard.ui.theme.JetBizCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetBizCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    CreateBizCard()
                }
            }
        }
    }
}

@Composable
fun CreateBizCard() {
    Surface(
        Modifier.fillMaxSize()
    ) {
        Card(
            Modifier
                .padding(16.dp),
            elevation = 4.dp,
            backgroundColor = Color.White,
            shape = RoundedCornerShape(corner = CornerSize(16.dp))
        ){
            
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetBizCardTheme {
        // A surface container using the 'background' color from the theme
        CreateBizCard()
    }
}