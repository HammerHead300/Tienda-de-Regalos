package com.example.tiendaregalos

import android.graphics.drawable.Drawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Hogar(){
    Row(modifier = Modifier
        .background(Color.Magenta)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center){
        Text(text = "Hogar", fontSize = 30.sp)
    }
    LazyColumn(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(10.dp)){
        item{
            Text(text = "Mueble simple", fontSize = 20.sp)
            Image(painterResource(id = R.drawable.muebleblanco), contentDescription = null,
                modifier = Modifier
                    .size(width = 200.dp, height = 100.dp)
                    .padding(top = 10.dp))
            Text(text = "Mueble TV modelo Leti fabricado con madera de pino macizo en color Blanco." +
                    "\nDiseño elegante y actual que le dará a tu salón un ambiente nórdico con mucha" +
                    " luminosidad.\nPatas de madera de pino en color natural sujetas con una estructura" +
                    " de madera maciza anclada a la parte inferior del casco.\nDispone de una puerta " +
                    "con un estante central en color Blanco y de dos cajones con guía metálica para " +
                    "su fácil extracción.\nMedidas: Largo 140 cm, Profundo 40 cm y Alto 52 cm.",
                    modifier = Modifier.padding(10.dp))
            Divider()
        }
        item{
            Text(text = "Mueble con soporte para TV", fontSize = 20.sp)
            Image(painterResource(id = R.drawable.muebletv), contentDescription = null,
                modifier = Modifier
                    .size(width = 200.dp, height = 100.dp)
                    .padding(top = 10.dp))
            Text(text = "Acabado en melamina de calidad color blanco brillo y roble canadian, estilo" +
                    " nórdico.\n" +
                    "Sistema de apertura de puertas con expulsores (sistema push).\nMódulo TV con " +
                    "dos puertas en los extremos y dos huecos centrales.\nEstante de colgar con una " +
                    "puerta central, estantes en los extremos visibles.\nMedidas módulo Tv: 180 cm " +
                    "(ancho) x 51 cm (alto) x 41 cm (fondo).",
                modifier = Modifier.padding(10.dp))
            Divider()
        }

    }
}