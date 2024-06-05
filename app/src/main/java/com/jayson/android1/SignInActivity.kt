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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jayson.android1.ui.theme.Android1Theme

class SignInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Login()

        }
    }
}



@Preview(showBackground = true)
@Composable
fun Login(){


    var Name by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var Password by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var Email by remember {
        mutableStateOf(TextFieldValue(""))
    }
    val login = LocalContext.current






    Column(
        modifier = Modifier
            .background(Color(0xff008F9C))
            .fillMaxSize()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Spacer(
            modifier = Modifier
                .height(12.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.emoji),
            contentDescription = "Timer",
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp)),


            )
//                AsyncImage(
//                    model = "https://wallhaven.cc/w/yxlvdd",
//                    contentDescription = null,
//                )
        Spacer(
            modifier = Modifier
                .height(12.dp)
        )



        Text(
            text = "LOGIN",
            fontWeight = FontWeight.Bold,

            )
        Spacer(
            modifier = Modifier
                .height(12.dp)
        )
        Text(
            text = "Come back with your ID"
        )
        Text(
            text = "For easy,fast and secure login"
        )
        Spacer(
            modifier = Modifier
                .height(15.dp)
        )
        OutlinedTextField(
            value = Name,
            shape = RoundedCornerShape(20.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Blue,
                focusedBorderColor = Color.Magenta,
                focusedLabelColor = Color.Green
            ),
            onValueChange = { Name = it },
            label = {
                Text(text = "Name")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "usernameIcon"
                )
            }

        )
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        OutlinedTextField(
            value = Email,
            shape = RoundedCornerShape(20.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Blue,
                focusedBorderColor = Color.Magenta,
                focusedLabelColor = Color.Green
            ),
            onValueChange = { Email = it },
            label = { Text(text = "Email") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "usernameIcon"
                )
            })
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        OutlinedTextField(
            value = Password,
            shape = RoundedCornerShape(20.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Blue,
                focusedBorderColor = Color.Magenta,
                focusedLabelColor = Color.Green
            ),
            onValueChange = { Password = it },
            label = { Text(text = "Password") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "usernameIcon"
                )
            })
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Button(
            onClick = { login.startActivity(Intent(login, BarsActivity::class.java)) },
            colors = ButtonDefaults.buttonColors(Color(0xff335cff)),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "login")
        }
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Text(
            text= "Forgot Password ?",
            modifier = Modifier
                .clickable { }

        )

        Spacer(
            modifier = Modifier
                .height(20.dp)
        )
        Text(
            text = "OR",
            fontSize = 35.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier
                .height(20.dp)
        )
        Text(
            text = "Not a member ?"
        )
        Text(
            text = "Sign Up",
            modifier = Modifier
                .clickable { })

    }
}

