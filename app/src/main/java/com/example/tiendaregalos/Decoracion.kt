package com.example.tiendaregalos

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
fun Decoracion(){
    Row(modifier = Modifier
        .background(Color.Green)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center){
        Text(text = "Hogar", fontSize = 30.sp)
    }
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {
        item {
            Text(text = "Jarrón de cerámica, Azul, 7 x 7 x 12,5 cm", fontSize = 20.sp)
            Image(
                painterResource(id = R.drawable.jarron), contentDescription = null,
                modifier = Modifier
                    .size(width = 50.dp, height = 100.dp)
                    .padding(top = 10.dp)
            )
            Text(
                text = "El jarrón está hecho de la mejor cerámica.\n" +
                        "El tamaño del jarrón es: 7 x 7 x 12,5 cm.\n" +
                        "Diseño único.",
                modifier = Modifier.padding(10.dp)
            )
            Divider()
        }
        item {
            Text(text = "Ikea BARLAST Lámpara de pie, Base/tubo: acero. Sombra: plástico " +
                    "polipropileno, Negro/Blanco, 150 cm (59 in)",
                fontSize = 20.sp)
            Image(
                painterResource(id = R.drawable.lampara), contentDescription = null,
                modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
                    .padding(top = 10.dp)
            )
            Text(
                text = "Proporciona una luz difusa que es buena para difundir mucha luz alrededor " +
                        "de la habitación.\n" +
                        "La pantalla proporciona una luz suave y sin reflejos que es cómoda para" +
                        " tus ojos.\n" +
                        "La bombilla se vende por separado. Ikea recomienda bombilla LED E27 globo" +
                        " blanco ópalo.\n" +
                        "Base/tubo: acero, recubrimiento en polvo. Sombra: plástico " +
                        "polipropileno\n" +
                        "Limpiar con un paño suave humedecido en agua y un detergente suave " +
                        "o jabón, si es necesario. Limpiar con un paño limpio.",
                modifier = Modifier.padding(10.dp)
            )
            Divider()
        }
    }
}