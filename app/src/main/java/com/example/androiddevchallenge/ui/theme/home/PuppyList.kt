package com.example.androiddevchallenge.ui.theme.home

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.entities.Dog

@Composable
fun PuppyList(
    puppies: List<Dog>,
    navigateToPuppyDetails: (Dog) -> Unit
) {
    val scrollState = rememberLazyListState()

        LazyColumn(
            state = scrollState) {
            items(puppies.size) {
                puppies.forEach { puppy ->
                    PuppyListItem(puppy = puppy, navigateToPuppyDetails)
                }
            }

        }

}