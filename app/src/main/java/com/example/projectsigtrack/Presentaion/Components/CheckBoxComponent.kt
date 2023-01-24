package com.example.projectsigtrack.Presentaion.Components

import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CheckboxComponent(
    modifier: Modifier = Modifier,
    isMarked: Boolean = false,
    onCheckChange: (Boolean) -> Unit
) {

    var textFieldStatePass by remember {
        mutableStateOf("")
    }



    Row(verticalAlignment = Alignment.CenterVertically, modifier = modifier.fillMaxWidth()) {
        Checkbox(
            checked = isMarked,

            onCheckedChange = {
                onCheckChange.invoke(it)
                              },
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


        }
    }
}