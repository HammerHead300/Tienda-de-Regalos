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
fun Juguetes(){
    Row(modifier = Modifier
        .background(Color.Cyan)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center){
        Text(text = "Juguetes", fontSize = 30.sp)
    }
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {
        item {
            Text(text = "Exploding Kittens", fontSize = 20.sp)
            Image(
                painterResource(id = R.drawable.explodingkitten), contentDescription = null,
                modifier = Modifier
                    .size(width = 150.dp, height = 100.dp)
                    .padding(top = 10.dp)
            )
            Text(
                text = "Imploding Kittens es la primera expansión de Exploding Kittens y añade " +
                        "20 cartas nuevas.\n" +
                        "Puedes elegir con qué cartas jugar y añadirlas al mazo de Exploding " +
                        "Kittens\n" +
                        "El cono de la vergüenza, de tamaño humano, es para que sea llevado por " +
                        "el jugador más despistado de la partida.\n" +
                        "Si olvidas de quién es el turno, te tocará llevarlo como recordatorio." +
                        " ¡Espabila o tendrás que ponértelo!\n" +
                        "Añade un sexto jugador a Exploding Kittens. A partir de 7 años de edad.",
                modifier = Modifier.padding(10.dp)
            )
            Divider()
        }
        item {
            Text(text = "Operación",
                fontSize = 20.sp)
            Image(
                painterResource(id = R.drawable.operacion), contentDescription = null,
                modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
                    .padding(top = 10.dp)
            )
            Text(
                text = "El juego clásico de Operación desafía a los niños a quitar " +
                        "las piezas sin hacer sonar la alarma.\n" +
                        "Incluye 13 piezas del cuerpo divertidas.\n" +
                        "La nariz se ilumina cuando las pinzas tocan los laterales.\n" +
                        "El jugador que quite más piezas del cuerpo gana.\n" +
                        "Los niños pueden jugar solos o con amigos.",
                modifier = Modifier.padding(10.dp)
            )
            Divider()
        }
    }
}