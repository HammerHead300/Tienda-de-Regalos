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
fun Electronica(){
    //La linea contiene el titulo del departamiento de la tienda
    Row(modifier = Modifier
        .background(Color.Red)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center){
        Text(text = "Electrónica", fontSize = 30.sp)
    }
    //Dentro de la LazyColumn introducimos todos los objetos que esten disponibles en el departamento
    LazyColumn(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(10.dp)){
        item {
            //Definimos el nombre del producto
            Text(text = "Beyerdinamic DT 770 Pro", fontSize = 20.sp)
            //Asignamos la imagen de producto
            Image(
                painterResource(id = R.drawable.beyerdinamic), contentDescription = null,
                modifier = Modifier
                    .size(width = 50.dp, height = 100.dp)
                    .padding(top = 10.dp))
            //Asignamos el texto descriptivo del producto
            Text(text = "Auriculares de estudio cerrados de campo difuso, innovador sistema bass " +
                    "reflex, Made in Germany\n" +
                    "Impedancia de 80 ohmios para su uso en estudio (ideal para grabaciones, " +
                    "monitorización)\n" +
                    "Resistente y cómodo diseño de la diadema de acero, acolchada y regulable, " +
                    "fácil de mantener gracias a sus piezas intercambiables\n" +
                    "Máxima comodidad: Almohadillas softskin circumaurales e intercambiables, suave " +
                    "diadema, entrada de cable unilateral (cable en espiral de 3,0 m)\n" +
                    "Incluyen: auriculares DT 770 PRO, adaptador jack estéreo 6,35 mm, bolsa con " +
                    "cierre de cuerda, manual de instrucciones, manual de garantía",
                modifier = Modifier.padding(10.dp))
            Divider()
        }
        item {
            //Definimos el nombre del producto
            Text(text = "SanDisk 1TB Extreme SSD portátil", fontSize = 20.sp)
            //Asignamos la imagen de producto
            Image(painterResource(id = R.drawable.sandisk), contentDescription = null,
                modifier = Modifier
                    .size(width = 50.dp, height = 100.dp)
                    .padding(top = 10.dp))
            //Asignamos el texto descriptivo del producto
            Text(text = "Disfruta de un rendimiento de estado sólido NVMe con velocidades de lectura" +
                    " de hasta 1050 MB/s y de escritura de hasta 1000 MB/s, en un disco portátil de " +
                    "gran capacidad, ideal para crear contenidos asombrosos o capturar grabaciones " +
                    "increíbles.\n" +
                    "Gracias a la protección contra caídas de hasta tres metros y a la protección " +
                    "IP65 contra el agua y el polvo, este disco tan resistente puede soportar todo " +
                    "lo que le eches.\n" +
                    "Viaja sin preocupaciones con una garantía limitada de cinco años y una " +
                    "resistente funda de silicona, que ofrece un tacto de calidad y protección " +
                    "adicional al exterior del disco.\n" +
                    "Usa la práctica asa con mosquetón para engancharlo a tu cinturón o mochila y " +
                    "tener la tranquilidad de que no lo perderás.\n" +
                    "Ayuda a mantener la privacidad de tus contenidos mediante la protección con " +
                    "contraseña incluida, que cuenta con cifrado por hardware AES de 256 bits. La " +
                    "protección con contraseña emplea cifrado AES de 256 bits y es compatible con " +
                    "Windows 8, Windows 10 y macOS 10.9 y versiones posteriores.\n" +
                    "Gestiona fácilmente archivos y libera espacio automáticamente con la " +
                    "aplicación SanDisk Memory Zone",
                modifier = Modifier.padding(10.dp))
            Divider()
        }
        item {
            //Definimos el nombre del producto
            Text(text = "DracoTek Terrain 4 - GPS para motos", fontSize = 20.sp)
            //Asignamos la imagen de producto
            Image(painterResource(id = R.drawable.gps), contentDescription = null,
                modifier = Modifier
                    .size(width = 50.dp, height = 100.dp)
                    .padding(top = 10.dp))
            //Asignamos el texto descriptivo del producto
            Text(text = "All Terrain System con pantalla de 4.3 pulgadas.\n" +
                    "Calificación de la prueba de agua IPX7.\n" +
                    "4 GB de memoria interna y conectividad Bluetooth.",
                modifier = Modifier.padding(10.dp))
            Divider()
        }
        item {
            //Definimos el nombre del producto
            Text(text = "Focusrite Scarlett 2i2 4.ª gen. interfaz de audio USB para grabar, " +
                    "componer, retransmitir y emitir pódcast. Grabación con sonido de estudio y " +
                    "alta fidelidad", fontSize = 20.sp)
            //Asignamos la imagen de producto
            Image(painterResource(id = R.drawable.interfaz), contentDescription = null,
                modifier = Modifier
                    .size(width = 50.dp, height = 100.dp)
                    .padding(top = 10.dp))
            //Asignamos el texto descriptivo del producto
            Text(text = "La interfaz de los artistas: conecta tu micrófono a los preamplificadores" +
                    " de 4.ª gen. Conecta la guitarra. Abre el software. Produce tu primer éxito.\n" +
                    "Sonido con calidad de estudio: la Scarlett incluye los conversores con 120" +
                    " dB de intervalo dinámico de las interfaces Focusrite que usan los mejores" +
                    " estudios.\n" +
                    "No vuelvas a perder una buena toma: Auto Gain encuentra el nivel perfecto" +
                    " para tu micro o guitarra. Con Clip Safe, evita los recortes y céntrate" +
                    " en la música.\n" +
                    "Encuentra tu propio sonido: el modo Air añade presencia musical y armonía" +
                    " intensa a tus grabaciones, para que destaquen las voces y guitarras en la" +
                    " mezcla.\n" +
                    "Todo lo que necesitas para grabar, mezclar y masterizar tu música: incluye " +
                    "el mejor software de grabación del sector y una completa colección de plug-ins.",
                modifier = Modifier.padding(10.dp))
            Divider()
        }

    }
}