package com.jayson.android1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jayson.android1.ui.theme.Android1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Main()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Main() {

    val SignIn = LocalContext.current

    Column(
                modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxSize()
                    .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center


        ) {
        Spacer(
            modifier = Modifier
                .height(12.dp)

        )
        Text(
            text = "Welcome To Meme Lord",
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,

            )
        Image(
            painter = painterResource(id = R.drawable.emoji),
            contentDescription = "Timer",
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp)),



            )
        Button(
            onClick = { SignIn.startActivity(Intent(SignIn, SignInActivity::class.java)) },
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(40.dp)
        ) {
            Text(
                text = "SignIn",
                fontSize = 30.sp,
                color = Color.White
            )


        }
    }
}


