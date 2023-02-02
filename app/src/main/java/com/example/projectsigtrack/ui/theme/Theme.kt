package com.example.projectsigtrack.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
    primary = PrimaryColor,
    onPrimary = PrimaryColor,

    secondary = SecondaryColor,
  //  onSecondary = SecondaryColor,
    primaryVariant= PrimaryVariant,
    background = WhiteColor,
   // onBackground = PrimaryColor,
    surface = TertiaryColor,
    //onSurface = TertiaryColor,

    error = ErrorColor,
    onError = ErrorColor,


    /* Other default colors to override
background = Color.White,
surface = Color.White,
onPrimary = Color.White,
onSecondary = Color.Black,
onBackground = Color.Black,
onSurface = Color.Black,
*/
)

private val DarkColorPalette = LightColorPalette


@Composable
fun ProjectSigtrackTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}