package com.example.projectsigtrack.Presentaion.Screens

import android.app.Presentation
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectsigtrack.Presentaion.Components.ButtonComponent
import com.example.projectsigtrack.Presentaion.Components.CheckboxComponent
import com.example.projectsigtrack.Presentaion.Components.StreamTextInputFields

import com.example.projectsigtrack.ui.theme.ProjectSigtrackTheme


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
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .background(MaterialTheme.colors.primaryVariant)
                .fillMaxWidth()
                .height(30.dp)

        ) {
            Text(
                text = "Connectivity",
                fontSize = 20.sp,
                color = MaterialTheme.colors.secondary,

            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier

                .padding(20.dp, 30.dp)
                .width(350.dp)
                .fillMaxHeight()

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

            val maxChar = 4

            StreamTextInputFields(
                Name = "Port Number",
                field = "port number",
                textFieldStream = textFieldStateNumber,
                textFieldStreamChange = {
                    textFieldStateNumber = it

                },
            )



            CheckboxComponent(isMarked =isMarked, onCheckChange = {
                isMarked =it
            } )
            ButtonComponent(Connect = "", onClick = {OnClick =it})
        }
    }

}


@Preview
@Composable
fun ConnectivityScreenPreview() {
    ProjectSigtrackTheme() {


        ConnectivityScreen()
    }
}
