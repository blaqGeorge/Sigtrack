package com.example.projectsigtrack.Presentaion.Components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StreamTextInputFields(
    Name: String,
    field: String,
    textFieldStream: String,
    textFieldStreamChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.Start,/*second column for name and textbox*/
        verticalArrangement = Arrangement.Top, modifier = modifier
            .fillMaxWidth()
            .height(100.dp)

    ) {
        Text(
            text = Name, fontWeight = FontWeight.SemiBold, modifier = Modifier
            /*.padding(1.dp)*/, color = MaterialTheme.colors.primaryVariant


        )


        TextField(
            value = textFieldStream,
            label = {
                Text(
                    field,
                    fontWeight = FontWeight.SemiBold,
                    fontStyle = FontStyle.Italic,
                    color = Color.Gray
                )
            }, onValueChange = textFieldStreamChange,
            singleLine = true,
            modifier = Modifier.fillMaxWidth()

        )
    }

}


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
    var isMarked by remember { mutableStateOf(false) }
    var textFieldStatePass by remember {
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
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = isMarked,
                    onCheckedChange = { isMarked = it },
                    colors = CheckboxDefaults.colors(MaterialTheme.colors.primaryVariant),

                    )
                Text(
                    text = "if stream has a key",
                    fontSize = 15.sp,
                    color = MaterialTheme.colors.primaryVariant
                )
            }
            AnimatedVisibility(isMarked) {

                Column(
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Top,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)

                ) {
                    StreamTextInputFields(
                        "Key", "key", textFieldStream = textFieldStatePass,
                        textFieldStreamChange = {
                            textFieldStatePass = it
                        },
                    )

                    buttonComponent()
                }
            }

        }
    }


}
