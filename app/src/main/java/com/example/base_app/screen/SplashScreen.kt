package com.example.base_app.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.base_app.R
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch
//
//@OptIn(ExperimentalPagerApi::class)
//@Composable
//fun SplashScreen() {
//    val pagerState = rememberPagerState()
//    val coroutineScope = rememberCoroutineScope()
//
//    val splashItems = listOf(
//        R.drawable.kidskarate,
//                R.drawable.kidskarate,
//                R.drawable.kidskarate
//    )
//
//    Column(modifier = Modifier.fillMaxSize().navigationBarsPadding()) {
//        HorizontalPager(
//            count = splashItems.size,
//            state = pagerState,
//            modifier = Modifier
//                .weight(1f)
//                .fillMaxWidth()
//        ) { page ->
//            Image(
//                painter = painterResource(id = splashItems[page]),
//                contentDescription = "Splash Image",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier.fillMaxSize()
//            )
//        }
//
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .shadow(
//                    elevation = 12.dp,
//                    shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp),
//                    clip = false
//                )
//                .background(
//                    color = Color.White,
//                    shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
//                )
//        )
//        {
//            Column(
//                modifier = Modifier
//                    .padding(24.dp)
//                    .fillMaxWidth(),
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                HorizontalPagerIndicator(
//                    pagerState = pagerState,
//                    activeColor = Color.Black,
//                    inactiveColor = Color.Gray,
//                    modifier = Modifier.padding(bottom = 16.dp)
//                )
//
//                Text(
//                    text = "Lorem Ipsum is simply dummy text of the printing",
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Bold,
//                    color = Color.Black
//                )
//
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text(
//                    text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text",
//                    fontSize = 14.sp,
//                    color = Color.DarkGray
//                )
//
//                Spacer(modifier = Modifier.height(24.dp))
//
//                Button(
//                    onClick = {
//                        if (pagerState.currentPage < splashItems.lastIndex) {
//                            coroutineScope.launch {
//                                pagerState.animateScrollToPage(pagerState.currentPage + 1)
//                            }
//                        } else {
//                            // Navigate to next screen
//                        }
//                    },
//                    shape = RoundedCornerShape(50),
//                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE53935)),
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .height(48.dp)
//                ) {
//                    Text("Get Started", color = Color.White)
//                    Spacer(modifier = Modifier.width(8.dp))
//                    Text("➤➤➤", color = Color.White)
//                }
//            }
//        }
//    }
//}



@OptIn(ExperimentalPagerApi::class)
@Composable
fun SplashScreen(navController: NavController) {
    val pagerState = rememberPagerState()
    val coroutineScope = rememberCoroutineScope()

    val splashItems = listOf(
        R.drawable.kidskarate,
        R.drawable.kidskarate,
        R.drawable.kidskarate
    )

    // Root container — don't add navigationBarsPadding here
    Box(modifier = Modifier.fillMaxSize()) {

        // Background: Fullscreen pager
        HorizontalPager(
            count = splashItems.size,
            state = pagerState,
            modifier = Modifier.fillMaxSize()
        ) { page ->
            Image(
                painter = painterResource(id = splashItems[page]),
                contentDescription = "Splash Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        // Foreground: Floating card over bottom image — above nav bar
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .shadow(
                    elevation = 18.dp,
                    shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
                    clip = false
                )
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
                )
        ) {
            // Calculate bottom padding for nav bar
            val bottomPadding = WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding()

            Column(
                modifier = Modifier
                    .padding(horizontal = 24.dp, vertical = 24.dp)
                    .padding(bottom = bottomPadding), // 👈 correct handling
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                HorizontalPagerIndicator(
                    pagerState = pagerState,
                    activeColor = Color.Black,
                    inactiveColor = Color.Gray,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                Text(
                    text = "Lorem Ipsum is simply dummy text of the printing",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text",
                    fontSize = 14.sp,
                    color = Color.DarkGray
                )

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = {
                        if (pagerState.currentPage < splashItems.lastIndex) {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(pagerState.currentPage + 1)
                            }
                        } else {
                           navController.navigate("home")
                        }
                    },
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE53935)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                ) {
                    Text("Get Started", color = Color.White)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("➤➤➤", color = Color.White)
                }
            }
        }
    }
}
