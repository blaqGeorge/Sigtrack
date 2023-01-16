package com.example.projectsigtrack.Presentaion.Screens

import android.app.Presentation
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectsigtrack.Presentaion.Components.CheckboxComponent
import com.example.projectsigtrack.Presentaion.Components.StreamTextInputFields
import com.example.projectsigtrack.Presentaion.Components.buttonComponent


@Composable
fun ConnectivityScreen() {
    val scaffoldState = rememberScaffoldState()

    var textFieldStream by remember {
        mutableStateOf("")
    }
    var textFieldProto by remember {
        mutableStateOf("")
    }
    var textFieldStateIP by remember {
        mutableStateOf("")
    }
    var textFieldStateNumber by remember {
        mutableStateOf("")
    }



    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
                .background(MaterialTheme.colors.primaryVariant)
        ) {
            Text(text = "Connectivity", fontSize = 20.sp, color = MaterialTheme.colors.secondary)
        }
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp, 30.dp)
        ) {


            StreamTextInputFields(
                "Stream Name",
                "stream name",
                textFieldStream = textFieldStream,
                textFieldStreamChange = {
                    textFieldStream = it
                }
            )




            StreamTextInputFields(
                "Protocol",
                "protocol",
                textFieldStream = textFieldProto,
                textFieldStreamChange = {
                    textFieldProto = it
                },
            )



            StreamTextInputFields(
                "IP Address",
                "ip address",
                textFieldStream = textFieldStateIP,
                textFieldStreamChange = {
                    textFieldStateIP = it
                },
            )



            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)

            ) {

                val maxChar = 4

                StreamTextInputFields(
                    Name = "Port Number",
                    field = "port number",
                    textFieldStream = textFieldStateNumber,
                    textFieldStreamChange = {
                        textFieldStateNumber = it

                    },
                )



            }
            CheckboxComponent()

            buttonComponent()



        }
    }


}
