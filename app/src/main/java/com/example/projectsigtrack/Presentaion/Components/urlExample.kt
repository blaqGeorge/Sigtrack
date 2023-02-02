package com.example.projectsigtrack.Presentaion.Components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ExampleUrl(){
    Text(text = "http:// www.soko.com/Stream.avi",color= Color.DarkGray, fontWeight = FontWeight.SemiBold)
    Text(text = "rtp:// www.example:1234",color= Color.DarkGray,fontWeight = FontWeight.SemiBold)
    Text(text = "rtsp:// www.sokoaerial.org:8080/test.sdp",color= Color.DarkGray,fontWeight = FontWeight.SemiBold)
    Text(text = "http:// www.youtube.com/watch?v=ssd67",color= Color.DarkGray,fontWeight = FontWeight.SemiBold)
}