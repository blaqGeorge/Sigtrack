package com.example.projectsigtrack.Presentaion.Screens

import android.app.Presentation
import android.graphics.Color
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectsigtrack.Presentaion.Components.*

import com.example.projectsigtrack.ui.theme.ProjectSigtrackTheme
import kotlin.math.round


@Composable
fun ConnectivityScreen() {
    val scaffoldState = rememberScaffoldState()

    var textFieldStream by rememberSaveable {
        mutableStateOf("")
    }
    var textFieldProto by rememberSaveable {
        mutableStateOf("")
    }
    var textFieldStateIP by rememberSaveable {
        mutableStateOf("")
    }
    var textFieldStateNumber by rememberSaveable {
        mutableStateOf("")
    }
    var isMarked by rememberSaveable { mutableStateOf(false) }
    var OnClick by remember { mutableStateOf("") }



    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState
    ) {

        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top,

            modifier = Modifier
                .background(
                    MaterialTheme.colors.primary,
                    shape = RoundedCornerShape(0.dp, 0.dp, 35.dp, 35.dp)
                )
                .width(400.dp)
                .height(350.dp)


        ) {
            Text(
                text = "Network Protocol",
                fontSize = 20.sp,
                color = MaterialTheme.colors.secondary,
                modifier = Modifier.padding(20.dp, 10.dp)

            )
            /* Column(horizontalAlignment = Alignment.End,
                 verticalArrangement = Arrangement.Top,
                 modifier = Modifier
                     .background(androidx.compose.ui.graphics.Color.Black)
                     .width(60.dp)
                     .height(60.dp)
             ) {

             }*/



            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier

                    .padding(30.dp, 40.dp)
                    .width(350.dp)
                    .fillMaxHeight()


            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(0.dp,20.dp)


                    ) {


                    StreamTextInputFields(
                        "Please enter a network URL:",
                        "Please enter a network url",
                        textFieldStream = textFieldStream,
                        textFieldStreamChange = {
                            textFieldStream = it
                        },
                    )

                    ButtonComponent(
                        modifier = Modifier.size(50.dp),
                        Connect = "",
                        onClick = { OnClick = it })


                }
                Column(modifier = Modifier.height(150.dp)) {
                    ExampleUrl()
                }
                /* Column(
                     horizontalAlignment = Alignment.End,
                     verticalArrangement = Arrangement.Top,
                     modifier = Modifier
                         .background(androidx.compose.ui.graphics.Color.Black)
                         .width(60.dp)
                         .height(60.dp)
                 ) {

                 }*/

            }
            /*  CheckboxComponent(isMarked =isMarked, onCheckChange = {
              isMarked =it
          } )*/

        }


    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier

            .padding(50.dp, 500.dp,50.dp,50.dp)

            .fillMaxHeight()
    )
    {
        PulseLoading()
    }

}


@Preview
@Composable
fun ConnectivityScreenPreview() {
    ProjectSigtrackTheme() {


        ConnectivityScreen()
    }
}
