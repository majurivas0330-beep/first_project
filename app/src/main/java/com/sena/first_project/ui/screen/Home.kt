package com.sena.first_project.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material3.Surface
import androidx.compose.ui.graphics.Color
import com.sena.first_project.ui.section.HeaderSection
import com.sena.first_project.ui.section.MainSection
import com.sena.first_project.ui.section.FooterSection

@Composable
fun Home(modifier: Modifier = Modifier) {

    Surface(
        modifier = modifier.fillMaxSize(),
        color = Color.Black
    ) {

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            HeaderSection()

            MainSection()

            FooterSection()

        }

    }

}