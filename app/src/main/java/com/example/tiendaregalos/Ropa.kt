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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp

@Composable
fun Ropa() {
    Row(modifier = Modifier
        .background(Color.Gray)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center){
        Text(text = "Ropa", fontSize = 30.sp)
    }
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {
        item {
            Text(text = "Jack & Jones Men Slim Fit Jeans Glenn Skinny Tapered Legs JJI Glenn " +
                    "Original Am", fontSize = 20.sp)
            Image(
                painterResource(id = R.drawable.vaqueros), contentDescription = null,
                modifier = Modifier
                    .size(width = 50.dp, height = 100.dp)
                    .padding(top = 10.dp)
            )
            Text(
                text = "Pantalones vaqueros de corte ajustado con perneras cónicas y cintura baja.\n" +
                        "Con detalles de estilo clásico de cinco bolsillos.\n" +
                        "Costuras clásicas estilo pitillo.\n" +
                        "Composición del material: 70 % algodón, 28 % poliéster, 2 % elastano.",
                modifier = Modifier.padding(10.dp)
            )
            Divider()
        }
        item {
            Text(text = "Joma Camiseta Brama Classic Manga Larga Camiseta Termica Textil",
                fontSize = 20.sp)
            Image(
                painterResource(id = R.drawable.camiseta), contentDescription = null,
                modifier = Modifier
                    .size(width = 50.dp, height = 100.dp)
                    .padding(top = 10.dp)
            )
            Text(
                text = "Camiseta terminal de manga larga.\n" +
                        "Térmica de cuello alto.\n" +
                        "Fabricada en poliamida.\n" +
                        "Ofrece comodidad y libertad de movimiento.",
                modifier = Modifier.padding(10.dp)
            )
            Divider()
        }
        item {
            //Definimos el nombre del producto
            Text(text = "adidas Entrada 22 Sweat Hoodie Sudadera con Capucha Hombre", fontSize = 20.sp)
            //Asignamos la imagen de producto
            Image(painterResource(id = R.drawable.adidas), contentDescription = null,
                modifier = Modifier
                    .size(width = 50.dp, height = 100.dp)
                    .padding(top = 10.dp))
            //Asignamos el texto descriptivo del producto
            Text(text = "Ajuste regular.\n" +
                    "Detalles distintivos de la marca.\n" +
                    "Ortega libertad de movimientos.\n" +
                    "Tiene detalles distintivos de la marca.",
                modifier = Modifier.padding(10.dp))
            Divider()
        }
        item {
            //Definimos el nombre del producto
            Text(text = "Crocs Classic Clogs", fontSize = 20.sp)
            //Asignamos la imagen de producto
            Image(painterResource(id = R.drawable.crocs), contentDescription = null,
                modifier = Modifier
                    .size(width = 50.dp, height = 100.dp)
                    .padding(top = 10.dp))
            //Asignamos el texto descriptivo del producto
            Text(text = "Material exterior: Sintético.\n" +
                    "Material de la suela: EVA.\n" +
                    "Tipo de tacón: Plano.",
                modifier = Modifier.padding(10.dp))
            Divider()
        }
    }
}