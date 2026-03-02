package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Cyan) {
        Text(
            text = "Hi, my name is $name!",
            modifier = modifier.padding(24.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Meghana")
    }
}


@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = "Title")
        Text(text = "Subtitle")
        Button(onClick = {}) {
            Text("Click Me")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    ColumnExample()
}

@Composable
fun RowExample() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Back")
        Text("Title")
        Text("Menu")
    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    RowExample()
}

@Composable
fun BoxExample() {
    Box(
        modifier = Modifier
            .size(120.dp)
            .background(Color.LightGray)
    ) {
        Text(
            text = "Badge",
            modifier = Modifier.align(Alignment.TopEnd)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BoxPreview() {
    BoxExample()
}

@Composable
fun PaddingOrderExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Padding then Background",
            modifier = Modifier
                .padding(16.dp)
                .background(Color.Yellow)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Background then Padding",
            modifier = Modifier
                .background(Color.Green)
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PaddingOrderPreview() {
    PaddingOrderExample()
}

@Composable
fun WeightExample() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Button(
            onClick = {},
            modifier = Modifier.weight(1f)
        ) {
            Text("Button 1")
        }

        Spacer(modifier = Modifier.width(8.dp))

        Button(
            onClick = {},
            modifier = Modifier.weight(1f)
        ) {
            Text("Button 2")
        }
    }
}
@Preview(showBackground = true, device = "spec:width=411dp,height=891dp")
@Composable
fun WeightPreviewPhone() {
    WeightExample()
}

@Composable
fun ArrangementExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Text("Top")

        Text(
            "Center",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Text("Bottom")
    }
}

@Preview(showBackground = true)
@Composable
fun ArrangementPreview() {
    ArrangementExample()
}