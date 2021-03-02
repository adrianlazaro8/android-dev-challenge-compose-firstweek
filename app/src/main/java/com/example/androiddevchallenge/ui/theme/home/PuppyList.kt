package com.example.androiddevchallenge.ui.theme.home

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.entities.Dog

@Composable
fun PuppyList(
    puppies: List<Dog>,
    navigateToPuppyDetails: (Dog) -> Unit
) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        LazyColumn(
        ) {
            puppies.forEach { puppy ->
                PuppyGridItem(puppy = puppy, navigateToPuppyDetails)
            }
        }
    }
}

@Composable
private fun PuppyGridItem(
    puppy: Dog,
    navigateToPuppyDetails: (Dog) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .clip(RoundedCornerShape(10.dp))
            .clickable {
                navigateToPuppyDetails.invoke(puppy)
            }
    ) {
        val image: Painter = painterResource(id = puppy.image)
        Image(
            modifier = Modifier
                .size(80.dp, 80.dp)
                .clip(RoundedCornerShape(16.dp)),
            painter = image,
            alignment = Alignment.CenterStart,
            contentDescription = "",
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(vertical = 10.dp, horizontal = 10.dp),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = puppy.name,
                style = MaterialTheme.typography.subtitle2
            )
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text(
                    text = "${puppy.age}, ${puppy.color}",
                    style = MaterialTheme.typography.caption
                )
            }
        }
    }
}