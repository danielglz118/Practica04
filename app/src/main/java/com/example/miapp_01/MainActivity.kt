package com.example.miapp_01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import com.example.miapp_01.ui.theme.MiAPP_01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MiAPP_01Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PantallaEscudos(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun PantallaEscudos(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(20.dp))

        //Titulo
        Text(
            text = "Linea Del Tiempo",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        //Subtexto
        Text(
            text = "Evolucion de los Escudos del Santos Laguna",
            fontSize = 18.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(30.dp))

        // ESCUDO 1
        FilaIzquierda(
            imagen = R.drawable.escudo2,
            anio = "1983",
            descripcion = "Primer Escudo del Club basado del imss",
            tamanoImagen = 100.dp
        )

        Spacer(modifier = Modifier.height(35.dp))

        // ESCUDO 2
        FilaDerecha(
            imagen = R.drawable.escudo22,
            año = "1997",
            descripcion = "Escudo del Primer Campeonanto.",
            tamanoImagen = 120.dp
        )

        Spacer(modifier = Modifier.height(35.dp))

        // ESCUDO 3
        FilaIzquierda(
            imagen = R.drawable.escudo333,
            anio = "2001",
            descripcion = "Escudo del Segundo Campeonato.",
            tamanoImagen = 150.dp
        )

        Spacer(modifier = Modifier.height(35.dp))

        // ESCUDO 4
        FilaDerecha(
            imagen = R.drawable.escudo1,
            año = "2008",
            descripcion = "Escudo conmemorativo de los 25 años",
            tamanoImagen = 110.dp
        )

        Spacer(modifier = Modifier.height(35.dp))

        // ESCUDO 5
        FilaIzquierda(
            imagen = R.drawable.escudo55,
            anio = "2015",
            descripcion = "Escudo del Quinto Campeonato.",
            tamanoImagen = 150.dp
        )

        Spacer(modifier = Modifier.height(35.dp))

        // ESCUDO 6
        FilaDerecha(
            imagen = R.drawable.escudo6,
            año = "2018",
            descripcion = "Escudo Actual del Club",
            tamanoImagen = 140.dp
        )

        Spacer(modifier = Modifier.height(30.dp))
    }
}

// Fila de Escudos a la Isquierda
@Composable
fun FilaIzquierda(
    imagen: Int,
    anio: String,
    descripcion: String,
    tamanoImagen: Dp = 100.dp
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        // ESCUDO
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.width(105.dp)
        ) {
            Text(
                text = "Año",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = anio,
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(7.dp))

            Image(
                painter = painterResource(id = imagen),
                contentDescription = "Escudo",
                modifier = Modifier.size(tamanoImagen),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(20.dp))

        }

        // FLechas
        Icon(
            imageVector = Icons.Default.ArrowForward,
            contentDescription = "Flecha",
            modifier = Modifier
                .size(42.dp)
                .padding(horizontal = 3.dp),
            tint = Color.Black
        )

        // DESCRIPCIÓN
        CuadroDescripcion(
            texto = descripcion
        )
    }
}

// Fila de Escudos a la Derecha
@Composable
fun FilaDerecha(
    imagen: Int,
    año: String,
    descripcion: String,
    tamanoImagen: Dp = 85.dp
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        // DESCRIPCIÓN
        CuadroDescripcion(
            texto = descripcion
        )

        // FLECHA
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Flecha",
            modifier = Modifier
                .size(42.dp)
                .padding(horizontal = 3.dp),
            tint = Color.Black
        )

        // ESCUDO
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.width(105.dp)
        ) {

            Text(
                text = "Año",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = año,
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(7.dp))

            Image(
                painter = painterResource(id = imagen),
                contentDescription = "Escudo",
                modifier = Modifier.size(tamanoImagen),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "",
                fontSize = 13.sp
            )
        }
    }
}

// Cuadro verde de la Descripcion de los Escudos
@Composable
fun CuadroDescripcion(
    texto: String
) {

    Box(
        modifier = Modifier
            .width(145.dp)
            .height(100.dp)
            .background(
                color = Color(0xFF2E7D32),
                shape = RoundedCornerShape(5.dp)
            )
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ) {

        Text(
            text = texto,
            color = Color.White,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
    }
}