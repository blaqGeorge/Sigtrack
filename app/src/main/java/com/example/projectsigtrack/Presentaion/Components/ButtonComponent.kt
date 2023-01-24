package com.example.projectsigtrack.Presentaion.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectsigtrack.R

@Composable
fun ButtonComponent(
    modifier: Modifier = Modifier,
    Connect: String ,
    onClick: (String) -> Unit,
    textAlign:TextAlign = TextAlign.Center
) {
    Row(
        horizontalArrangement = Arrangement.Center,

        modifier = modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(50.dp)
    ) {


        Button(
            onClick = {

                onClick.invoke(Connect) },
            shape = RoundedCornerShape(35.dp),
            contentPadding = PaddingValues(
                start = 50.dp, top = 12.dp, end = 50.dp, bottom = 12.dp
            ),
            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary),

            ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

                ) {
                Image(
                    painter = painterResource(R.drawable.podcasts_btn),
                    contentDescription = ""
                )
                Text(
                    text = "Connect",
                    Modifier.padding(

                    ),
                    color = MaterialTheme.colors.secondary,
                    fontSize = 20.sp,
                    textAlign=textAlign
                )

            }
        }


    }
}