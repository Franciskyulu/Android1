package com.jayson.android1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jayson.android1.ui.theme.Android1Theme

class BarsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomBar()
            Bottom()

            }
        }
    }




@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Bottom(){
    val Commerce= LocalContext.current


    var search by remember {
        mutableStateOf(TextFieldValue(""))
    }








    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { /*TODO*/ })
            TopAppBar(
                title = {
                    Text(text = "Welcome to meme lord")
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                },

            )
        },

        content = {
            LazyColumn(modifier=Modifier.fillMaxSize()) {
                item {
                    Row {
                        Spacer(modifier = Modifier.height(200.dp))

                        ElevatedCard(
                            colors = CardDefaults.cardColors(
                                Color.Red
                            ),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 6.dp
                            ),
                            modifier = Modifier
                                .fillMaxWidth()

                        )
                        {
                            Column(modifier=Modifier.fillMaxWidth(),
                                horizontalAlignment = Alignment.Start,
                                verticalArrangement = Arrangement.SpaceEvenly
                            )
                            {
                                Text(text = "Location")
                                Text(text = "New York, USA",)
                            }
                            OutlinedTextField(value =search,
                                onValueChange ={search=it} ,
                                colors = OutlinedTextFieldDefaults.colors(
                                    unfocusedBorderColor = Color.White,
                                    focusedBorderColor = Color.White,
                                    unfocusedLabelColor = Color.Black,
                                    focusedLabelColor = Color.Black,
                                    focusedTextColor = Color.Cyan
                                ),

                                label = { Text(text = "Search") },

                                modifier = Modifier.padding(4.dp),
                                shape = RoundedCornerShape(6.dp),
                                leadingIcon = {
                                    (Icon(imageVector = Icons.Default.Search, contentDescription = ""))
                                }
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Row {
                            Text(text = "#Special for you",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color= Color.Black
                            )
                            Spacer(modifier = Modifier.width(150.dp))
                            Text(text = "see all",
                                color = Color.Red)

                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Image(painter = painterResource(id = R.drawable.emoji), contentDescription = null,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Row {
                            Text(text = "Categories",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color= Color.Black
                            )
                            Spacer(modifier = Modifier.width(200.dp))
                            Text(text = "see all",
                                color = Color.Red)
                        }

                        LazyRow {
                            item {
                                Row {
                                    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(painter = painterResource(id =R.drawable.shirt ) , contentDescription = null)
                                        Text(text = "Clothes",
                                            color = Color.Black,
                                            fontSize = 15.sp,
                                            fontWeight = FontWeight.Light)
                                    }
                                    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(painter = painterResource(id =R.drawable.elect ) , contentDescription = null,
                                            modifier = Modifier
                                                .size(width=300.dp, height = 123.dp )
                                                .clip(RoundedCornerShape(40.dp)))
                                        Text(text = "Electronics",
                                            color = Color.Black,
                                            fontSize = 15.sp,
                                            fontWeight = FontWeight.Light)
                                    }
                                    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(painter = painterResource(id =R.drawable.airmax ) , contentDescription = null,
                                            modifier = Modifier
                                                .size(width=300.dp, height = 120.dp )
                                                .clip(RoundedCornerShape(40.dp))
                                        )
                                        Text(text = "Shoes",
                                            color = Color.Black,
                                            fontSize = 15.sp,
                                            fontWeight = FontWeight.Light)
                                    }
                                    Column {
                                        Image(painter = painterResource(id =R.drawable.rolex ) , contentDescription = null,
                                            modifier = Modifier
                                                .size(width=300.dp, height = 120.dp )
                                                .clip(RoundedCornerShape(40.dp)))
                                        Text(text = "Watch",
                                            color = Color.Black,
                                            fontSize = 15.sp,
                                            fontWeight = FontWeight.Light)
                                    }

                                }
                            }

                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Row {
                            Text(text = "Flash Sale",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color= Color.Black
                            )
                            Spacer(modifier = Modifier.width(150.dp))
                            Text(text = "Closing in...",
                                color = Color.Black,
                                fontWeight = FontWeight.Light)
                        }
                        Row {
                            Button(onClick  = { Commerce.startActivity(Intent(Commerce, CommerceActivity::class.java)) },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RoundedCornerShape(40.dp) )
                            {
                                Text(
                                    text = "All",
                                    fontSize = 15.sp,
                                    color = Color.Black
                                )
                            }
                            Button(onClick ={ Commerce.startActivity(Intent(Commerce, CommerceActivity::class.java)) },
                                colors = ButtonDefaults.buttonColors(Color.Red),
                                shape = RoundedCornerShape(40.dp) )
                            {
                                Text(
                                    text = "Newest",
                                    fontSize = 15.sp,
                                    color = Color.Black
                                )

                            }
                            Button(onClick =  { Commerce.startActivity(Intent(Commerce, CommerceActivity::class.java)) },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RoundedCornerShape(40.dp) )
                            {
                                Text(
                                    text = "Popular",
                                    fontSize = 15.sp,
                                    color = Color.Black
                                )
                            }
                            Button(onClick =  { Commerce.startActivity(Intent(Commerce, CommerceActivity::class.java)) },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RoundedCornerShape(40.dp))
                            {
                                Text(
                                    text = "Clothes",
                                    fontSize = 15.sp,
                                    color = Color.Black
                                )
                            }

                        }

                    }

                }

            }





        },

        bottomBar = { BottomBar()}
    )
}
@Composable
fun BottomBar() {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp, backgroundColor = Color.Cyan) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"", tint = Color.Red)
        },
            label = { Text(text = "Home") }, selected = (selectedIndex.value == 0), onClick = {
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,"",tint = Color.Red)
        },
            label = { Text(text = "Favorite") }, selected = (selectedIndex.value == 1), onClick = {
                selectedIndex.value = 1
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "",tint = Color.Red)
        },
            label = { Text(text = "Profile") }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })

    }
}
