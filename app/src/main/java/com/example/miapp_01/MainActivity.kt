package com.example.miapp_01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.miapp_01.ui.theme.MiAPP_01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiAPP_01Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Formulario()
                }
            }
        }
    }
}
@Composable
fun Formulario(){
    Row(
        modifier= Modifier
            .fillMaxWidth()
            .padding(96.dp),
        horizontalArrangement  =
            Arrangement.spacedBy(12.dp),
        verticalAlignment =
            Alignment.CenterVertically
    ){
        Text("Titulo",fontSize=16.sp)
        Text("Subtitulo",fontSize=14.sp)
        Button(onClick = {}) {
            Text("Ingresar", fontWeight = FontWeight.Bold)
        }
    }
}