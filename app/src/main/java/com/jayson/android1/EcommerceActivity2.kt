package com.jayson.android1

import android.content.ClipData.Item
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.jayson.android1.ui.theme.Android1Theme

class EcommerceActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Product()


        }
    }
}




@Preview(showBackground = true)
@Composable
fun Product(){
    LazyColumn(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .fillMaxHeight(),
    ) {
        item() {
            Column {


            }



        }
    }

}
