package com.lattaro.passweird.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.lattaro.passweird.R

val InterFont = FontFamily(
    Font(R.font.inter_regular, FontWeight.Normal),
    Font(R.font.inter_bold, FontWeight.Bold),
    Font(R.font.inter_thin, FontWeight.Thin),
    Font(R.font.inter_semibold, FontWeight.SemiBold),
    Font(R.font.inter_medium, FontWeight.Medium)
)
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = InterFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    titleLarge = TextStyle(
        fontFamily = InterFont
    ),

    labelLarge = TextStyle(
        fontFamily = InterFont
    ),
)
