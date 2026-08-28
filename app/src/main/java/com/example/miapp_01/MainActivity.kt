package com.example.miapp_01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.tooling.preview.Preview
import com.example.miapp_01.ui.theme.MiAPP_01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiAPP_01Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                  saludo("Jose Luis")
                }
            }
        }
    }
}

@Composable
fun saludo(nombre: String){
    Text(
        text=nombre,
        fontSize = 50.sp,
        modifier= Modifier
            .padding(106.dp)
            .background(
                Color.Cyan,
                shape= RoundedCornerShape(12.dp)
            )
    )
}