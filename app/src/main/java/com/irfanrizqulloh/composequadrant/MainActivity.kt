package com.irfanrizqulloh.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.irfanrizqulloh.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Quadrant() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(1f)) {
            Article(
                stringResource(R.string.first_text_article1),
                stringResource(R.string.second_text_article1),
                colorResource(R.color.first_color),
                modifier = Modifier.weight(1f)
            )
            Article(
                stringResource(R.string.first_text_article2),
                stringResource(R.string.second_text_article2),
                colorResource(R.color.second_color),
                modifier = Modifier.weight(1f)

            )
        }
        Row(modifier = Modifier.weight(1f)) {
            Article(
                stringResource(R.string.first_text_article3),
                stringResource(R.string.second_text_article3),
                colorResource(R.color.third_color),
                modifier = Modifier.weight(1f)
            )
            Article(
                stringResource(R.string.first_text_article4),
                stringResource(R.string.second_text_article4),
                colorResource(R.color.fourth_color),
                modifier = Modifier.weight(1f)
            )
        }
    }


}

@Composable
fun Article(firstText: String, secondText: String, color: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().background(color = color).padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = firstText,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,

            )
        Text(
            text = secondText, textAlign = TextAlign.Justify

        )
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun QuadrantPreview() {
    ComposeQuadrantTheme {
        Quadrant()
    }
}