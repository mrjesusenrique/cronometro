package com.example.cronometro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.cronometro.ui.theme.CronometroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CronometroTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CronometroView(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}