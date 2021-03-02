package com.example.androiddevchallenge.ui.theme.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.entities.Dog

@Composable
fun Detail(
    puppy: Dog,
    navigateBack: () -> Unit
) {
    Surface(color = MaterialTheme.colors.background) {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            Header(puppy = puppy)
            Info(puppy = puppy)
        }

        IconButton(onClick = navigateBack) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Back",
                tint = Color.White
            )
        }
    }
}

@Composable
private fun Header(
    puppy: Dog
) {
    val image: Painter = painterResource(id = puppy.image)
    Image(
        modifier = Modifier
            .size(80.dp, 80.dp)
            .clip(RoundedCornerShape(16.dp)),
        painter = image,
        alignment = Alignment.CenterStart,
        contentDescription = "Dog",
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun Info(puppy: Dog) {
    Column(
        modifier = Modifier.padding(10.dp)
    ) {
        Text(
            text = "Puppy",
            style = MaterialTheme.typography.caption
        )

        Text(
            text = puppy.name,
            style = MaterialTheme.typography.h4
        )

        Text(
            text = "About",
            style = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.Medium)
        )
        Spacer(modifier = Modifier.height(5.dp))
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(
                text = puppy.description,
                style = MaterialTheme.typography.subtitle1
            )
        }
    }
}