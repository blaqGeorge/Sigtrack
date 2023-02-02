package com.example.projectsigtrack.Presentaion.Components

import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.SemanticsActions.OnClick
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projectsigtrack.Presentaion.Screens.ConnectivityScreen
import com.example.projectsigtrack.ui.theme.ProjectSigtrackTheme

@Composable
fun PulseLoading(
    durationMillis: Int = 1000,
    maxPulseSize: Float = 300f,
    minPulseSize: Float = 60f,
    maxPulseSize1: Float = 150f,

    pulseColor: Color = Color(234, 240, 246),
    pulseColor1: Color = Color(128, 128, 128),
    centreColor: Color = Color(66, 133, 244)
) {
    val infiniteTransition = rememberInfiniteTransition()
    val size by infiniteTransition.animateFloat(
        initialValue = minPulseSize,
        targetValue = maxPulseSize,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        )
    )
    val size1 by infiniteTransition.animateFloat(
        initialValue = minPulseSize,
        targetValue = maxPulseSize1,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        )
    )
    val alpha by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        )
    )
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Card(
            shape = CircleShape,
            modifier = Modifier
                .size(size.dp)
                .align(Alignment.Center)
                .padding(10.dp)
                .alpha(alpha),
            backgroundColor = pulseColor,
            elevation = 0.dp

        ) {

        }
        Card(
            shape = CircleShape,
            modifier = Modifier
                .size(size1.dp)
                .align(Alignment.Center)
                .alpha(alpha),
            backgroundColor = pulseColor1,
            elevation = 0.dp

        ) {

        }
        Card(
            modifier = Modifier
                .size(minPulseSize.dp)

                .align(Alignment.Center),
            shape = CircleShape,
            backgroundColor = centreColor
        ) {
            ButtonComponent(Connect = "", onClick = { OnClick })

        }
    }
}

@Preview
@Composable
fun pulsef() {
    ProjectSigtrackTheme() {


        PulseLoading()
    }
}