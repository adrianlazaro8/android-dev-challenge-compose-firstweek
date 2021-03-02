package com.example.androiddevchallenge.ui.theme.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
fun PuppyListItem(
    puppy: Dog,
    navigateToPuppyDetails: (Dog) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .clip(RoundedCornerShape(4.dp))
            .clickable {
                navigateToPuppyDetails.invoke(puppy)
            }
    ) {
        val image: Painter = painterResource(id = puppy.image)
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(4.dp, 4.dp)),
            painter = image,
            alignment = Alignment.CenterStart,
            contentDescription = "",
            contentScale = ContentScale.Crop
        )
        Column(

            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .padding(vertical = 10.dp, horizontal = 10.dp),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = puppy.name,
                style = MaterialTheme.typography.subtitle2,
                color = Color.White
            )
            Text(
                text = "Color: ${puppy.color} - Age:${puppy.age} ",
                style = MaterialTheme.typography.caption,
                color = Color.White
            )
        }
    }
}
