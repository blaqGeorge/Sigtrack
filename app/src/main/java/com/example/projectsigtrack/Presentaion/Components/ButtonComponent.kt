package com.example.projectsigtrack.Presentaion.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectsigtrack.R

@Composable
fun ButtonComponent(
    modifier: Modifier = Modifier,
    Connect: String,
    onClick: (String) -> Unit,
    textAlign: TextAlign = TextAlign.Center
) {


    Button(
        onClick = {

            onClick.invoke(Connect)
        },
/*modifier.drawBehind { Shadow },*/
        modifier.clip(shape = CircleShape),

        contentPadding = PaddingValues(
            start = 20.dp, top = 20.dp, end = 20.dp, bottom = 20.dp
        ),
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primaryVariant)


        ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Image(
                painter = painterResource(R.drawable.podcasts_btn),
                contentDescription = ""
            )
            /*  Text(
                  text = "Connect",
                  Modifier.padding(

                  ),
                  color = MaterialTheme.colors.secondary,
                  fontSize = 20.sp,
                  textAlign = textAlign
              )*/

        }
    }


}
