package com.example.androiddevchallenge.ui.theme.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.entities.Dog

@Composable
fun Home(
    puppies: List<Dog>,
    navigateToPuppyDetails: (Dog) -> Unit
) {
    Scaffold(
        topBar = { AppBar() }
    ) {
        Surface(color = MaterialTheme.colors.background) {
            PuppyList(puppies, navigateToPuppyDetails)
        }
    }

}

@Composable
private fun AppBar() {
    TopAppBar(
        backgroundColor = MaterialTheme.colors.surface,
        title = {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {

                ProvideTextStyle(value = MaterialTheme.typography.h6) {
                    CompositionLocalProvider(
                        LocalContentAlpha provides ContentAlpha.high,
                        content = {
                            Text(
                                text = "PuppiesApp"
                            )
                        }
                    )
                }
            }
        }
    )
}