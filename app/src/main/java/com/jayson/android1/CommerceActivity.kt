package com.jayson.android1

import android.content.ClipData.Item
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.LeadingIconTab
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jayson.android1.ui.theme.Android1Theme

class CommerceActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          Commerce()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun Commerce() {
    var Search by remember {
        mutableStateOf(TextFieldValue(""))


    }
    LazyColumn( modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
        .fillMaxHeight(),) {
        item { 
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .background(Color.Red)
                    .fillMaxSize()
                    .fillMaxWidth()
                    .fillMaxHeight(),




                
            )
            {
                Text(text = "Location",
                    fontSize = (10.sp))
            Row {
                Text(text = "New York,USA>",
                    fontSize = (10.sp))

            Spacer(modifier = Modifier
                .height(15.dp))
            Row(
                modifier = Modifier
                    .padding(1.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Top,
            ) {
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = "location icon",
                    modifier = Modifier
                        .size(40.dp),
                    tint = Color.DarkGray,)
//               Text(
//                    text = "New York City,USA",
//                   Color = Color.Black,
//                   fontSize = 25.sp
//                    )
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription ="arrow",
                    tint = Color.DarkGray,
                    modifier = Modifier
                        .size(40.dp)
                        .clickable { }
                        .border(
                            1.dp, Color.LightGray,
                            RoundedCornerShape(10.dp)
                        )
                        .padding(10.dp),)}
                Spacer(modifier = Modifier
                    .height(15.dp))
                Row(
                    modifier = Modifier
                        .padding(8.dp),
                    horizontalArrangement =  Arrangement.Start) {



                }
                OutlinedTextField(
                    value = Search,
                    shape = RoundedCornerShape(30.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color.Blue,
                        focusedBorderColor = Color.Magenta,
                        focusedLabelColor = Color.Green
                    ),
                    onValueChange = {Search =it},
                    label = { Text(text = "Search")},
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Search,
                            contentDescription = "SearchIcon")
                    })













//


            }















            
        }
    }
    
}
}












