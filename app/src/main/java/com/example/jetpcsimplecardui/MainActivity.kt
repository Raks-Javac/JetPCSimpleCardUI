package com.example.jetpcsimplecardui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpcsimplecardui.ui.theme.JetPCSimpleCardUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPCSimpleCardUITheme {
                // A surface container using the 'background' color from the theme
                Surface(

                    color = MaterialTheme.colors.background
                ) {
CardUI()
                }
            }
        }
    }
}

@Composable
fun CardUI(){
    Surface(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()) {
        Text(text = "Getting Started")
        
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPCSimpleCardUITheme {
CardUI()
    }
}