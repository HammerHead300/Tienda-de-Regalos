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
    //La linea contiene el titulo del departamiento de la tienda
    Row(modifier = Modifier
        .background(Color.Cyan)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center){
        Text(text = "Juguetes", fontSize = 30.sp)
    }
    //Dentro de la LazyColumn introducimos todos los objetos que esten disponibles en el departamento
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {
        item {
            //Definimos el nombre del producto
            Text(text = "Exploding Kittens", fontSize = 20.sp,
                modifier = Modifier.padding(top = 10.dp))
            //Asignamos la imagen de producto
            Image(
                painterResource(id = R.drawable.explodingkitten), contentDescription = null,
                modifier = Modifier
                    .size(width = 150.dp, height = 100.dp)
                    .padding(top = 10.dp)
            )
            //Asignamos el texto descriptivo del producto
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
            //Definimos el nombre del producto
            Text(text = "Operación",
                fontSize = 20.sp, modifier = Modifier.padding(top = 10.dp))
            //Asignamos la imagen de producto
            Image(
                painterResource(id = R.drawable.operacion), contentDescription = null,
                modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
                    .padding(top = 10.dp)
            )
            //Asignamos el texto descriptivo del producto
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
        item {
            //Definimos el nombre del producto
            Text(text = "Munchkin Warhammer Age of Sigmar", fontSize = 20.sp,
                modifier = Modifier.padding(top = 10.dp))
            //Asignamos la imagen de producto
            Image(painterResource(id = R.drawable.munchkin), contentDescription = null,
                modifier = Modifier
                    .size(width = 50.dp, height = 100.dp)
                    .padding(top = 10.dp))
            //Asignamos el texto descriptivo del producto
            Text(text = "Combinación de los mundos de fantasía Warhammer Age of Sigmar y Munchkin.\n" +
                    "Variante Munchkin.\n" +
                    "Los jugadores luchan contra los lacayos del caos y la muerte en uno de los " +
                    "ejércitos de las Grandes Alianzas.\n" +
                    "Juego divertido a partir de 12 años.\n" +
                    "Duración del juego: 60-90 minutos.\n" +
                    "Número de jugadores: 3-6.",
                modifier = Modifier.padding(10.dp))
            Divider()
        }
        item {
            //Definimos el nombre del producto
            Text(text = "Juego de ajedrez Plegable de Madera de 15 Pulgadas con 3 Pulgadas",
                fontSize = 20.sp, modifier = Modifier.padding(top = 10.dp))
            //Asignamos la imagen de producto
            Image(painterResource(id = R.drawable.chess), contentDescription = null,
                modifier = Modifier
                    .size(width = 50.dp, height = 100.dp)
                    .padding(top = 10.dp))
            //Asignamos el texto descriptivo del producto
            Text(text = "[Diseño inevitable] La chine de una tabla plegable tradicional siempre" +
                    " inevitably bulges, lo que crea un hueco elevado en el centro de la tabla." +
                    " Mini soporte original A&A soporta la tabla como una mesa de mesa, por lo" +
                    " que la tabla está completamente plana cuando se juega. Y el mini soporte" +
                    " también puede proporcionar una excelente protección para la superficie de" +
                    " la mesa de la cerradura de metal de la caja de chess.\n" +
                    "[Calidad premium] A&A Chess insists on the natural wood rather than" +
                    " staining to get the product's appearance color, and the first of its kind" +
                    " design of its chess pieces play makes you feel comfortable at the moment" +
                    " of opening the box.\n",
                modifier = Modifier.padding(10.dp))
            Divider()
        }
    }
}