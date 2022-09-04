package com.giftech.jetbizcard

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
private fun CreateImageProfile(modifier: Modifier = Modifier) {
    Surface(
        Modifier
            .size(150.dp)
            .padding(4.dp),
        shape = CircleShape,
        border = BorderStroke(0.5.dp,Color.LightGray),
        elevation = 4.dp,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
    ){
        Image(
            modifier = Modifier.size(135.dp),
            painter = painterResource(R.drawable.profile_image),
            contentDescription = "Profile Image",
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun CreateBizCard() {
    Surface(
        Modifier.fillMaxSize()
    ) {
        Card(
            Modifier
                .width(200.dp)
                .height(390.dp)
                .padding(16.dp),
            elevation = 4.dp,
            backgroundColor = Color.White,
            shape = RoundedCornerShape(corner = CornerSize(16.dp))
        ){
            Column(
                Modifier.height(300.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                CreateImageProfile()
                Divider(
                    Modifier.padding(vertical = 16.dp)
                )
                CreateInfo()
                Button(
                    onClick = { Log.d("TAG", "CreateBizCard: ") },
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text("Portfolio", style = MaterialTheme.typography.button)
                }
            }
        }
    }
}

@Composable
private fun CreateInfo() {
    Column(
        Modifier.padding(4.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            "Galih Indra F",
            style = MaterialTheme.typography.h4,
            color = MaterialTheme.colors.primaryVariant
        )
        Text(
            "Android Compose Programmer",
            Modifier.padding(3.dp),
        )
        Text(
            "@gif.tech",
            Modifier.padding(3.dp),
            style = MaterialTheme.typography.subtitle1
        )
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