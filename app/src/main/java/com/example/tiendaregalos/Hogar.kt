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
    //La linea contiene el titulo del departamiento de la tienda
    Row(modifier = Modifier
        .background(Color.Magenta)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center){
        Text(text = "Hogar", fontSize = 30.sp)
    }
    //Dentro de la LazyColumn introducimos todos los objetos que esten disponibles en el departamento
    LazyColumn(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(10.dp)){
        item{
            //Definimos el nombre del producto
            Text(text = "Mueble simple", fontSize = 20.sp)
            //Asignamos la imagen de producto
            Image(painterResource(id = R.drawable.muebleblanco), contentDescription = null,
                modifier = Modifier
                    .size(width = 200.dp, height = 100.dp)
                    .padding(top = 10.dp))
            //Asignamos el texto descriptivo del producto
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
            //Definimos el nombre del producto
            Text(text = "Mueble con soporte para TV", fontSize = 20.sp)
            //Asignamos la imagen de producto
            Image(painterResource(id = R.drawable.muebletv), contentDescription = null,
                modifier = Modifier
                    .size(width = 200.dp, height = 100.dp)
                    .padding(top = 10.dp))
            //Asignamos el texto descriptivo del producto
            Text(text = "Acabado en melamina de calidad color blanco brillo y roble canadian, estilo" +
                    " nórdico.\n" +
                    "Sistema de apertura de puertas con expulsores (sistema push).\nMódulo TV con " +
                    "dos puertas en los extremos y dos huecos centrales.\nEstante de colgar con una " +
                    "puerta central, estantes en los extremos visibles.\nMedidas módulo Tv: 180 cm " +
                    "(ancho) x 51 cm (alto) x 41 cm (fondo).",
                modifier = Modifier.padding(10.dp))
            Divider()
        }
        item{
            //Definimos el nombre del producto
            Text(text = "Dormio Zafiro - Colchón viscoelástico, Blanco, 135 x 190 x 21 cm",
                fontSize = 20.sp)
            //Asignamos la imagen de producto
            Image(painterResource(id = R.drawable.colchon), contentDescription = null,
                modifier = Modifier
                    .size(width = 200.dp, height = 100.dp)
                    .padding(top = 10.dp))
            //Asignamos el texto descriptivo del producto
            Text(text = "El colchón Zafiro está acolchado con 3 cm de visco de densidad" +
                    " garantizando un nivel de confort superior junto con un núcleo de resiliencia" +
                    " indeformable, que impide deformaciones en el mismo, así como garantiza la" +
                    " independencia del descanso, con lo que no notamos el movimiento del otro" +
                    " durmiente.\n" +
                    "El lateral del colchón está acolchado con tejido 3D súper transpirable, que" +
                    " garantiza una total circulación de aire, logrando así una óptima ventilación" +
                    " del interior del colchón.\n" +
                    "En todas sus fibras textiles de amplio gramaje, encontramos un tratamiento" +
                    " anti-ácaros y anti-bacterias que ayudan a impedir las reacciones alérgicas" +
                    " y mejoran el descanso.\n" +
                    "Su acolchado garantiza la óptima posición de la columna, al acoplarse a la" +
                    " forma de esta, con lo que nos ayuda a evitar los dolores de espalda al descansar.\n" +
                    "Fabricado con productos 100% de España cuenta con la certificación de" +
                    " calidad de Aitex, Oeko-Tex y Hyg Cen en sus componentes siendo por ello" +
                    " garantía de calidad y de la no utilización de productos perjudiciales para" +
                    " la salud en la fabricación de los mismos.\n" +
                    "Altura total 21 cm",
                modifier = Modifier.padding(10.dp))
            Divider()
        }
        item{
            //Definimos el nombre del producto
            Text(text = "rattantree Silla de Oficina, Silla de Escritorio Ergonómica con" +
                    " Reposacabezas Ajustable y Soporte Lumbar, Respaldo de Malla Transpirable," +
                    " Reposabrazos Abatibles de 90°, Silla Giratoria de 360°", fontSize = 20.sp)
            //Asignamos la imagen de producto
            Image(painterResource(id = R.drawable.silla), contentDescription = null,
                modifier = Modifier
                    .size(width = 200.dp, height = 100.dp)
                    .padding(top = 10.dp))
            //Asignamos el texto descriptivo del producto
            Text(text = "【Diseño ergonómico】Con un diseño ergonómico de respaldo curvo, con" +
                    " reposacabezas ajustable y soporte lumbar, rattantree silla de oficina" +
                    " puede adaptarse perfectamente a su cuerpo, brindar un apoyo cómodo para" +
                    " su espalda y aliviar el estrés sedentario y el dolor de espalda para" +
                    " que pueda concentrarse.\n" +
                    "【Cómodo y duradero】El respaldo y la superficie del cojín del asiento están" +
                    " hechos de malla transpirable de alta calidad, que es resistente al desgaste" +
                    " y transpirable. El cojín del asiento está relleno con una esponja de alta" +
                    " densidad, que es suave y cómoda. Las ruedas de nailon en el parte inferior" +
                    " puede moverse 360° silenciosamente en pisos de diferentes materiales.\n" +
                    "【Reposabrazos abatibles de 90°】 Con un reposabrazos acolchado abatible de" +
                    " 90°, rattantree silla de oficina puede proporcionar suficiente apoyo para" +
                    " la parte superior del cuerpo, le permite trabajar cómodamente y la silla" +
                    " de la computadora se puede colocar debajo del escritorio fácilmente para" +
                    " ahorrar espacio.\n" +
                    "【Fácil de Montar】Con instrucciones claras y todas las herramientas" +
                    " necesarias para el montaje, puede completar fácilmente el montaje en 20" +
                    " minutos, si encuentra algún problema durante el montaje, contáctenos." +
                    " La silla de oficina rattantree se puede usar ampliamente en oficinas," +
                    " salas de estudio, salas de conferencias, dormitorios y otros lugares " +
                    "diferentes, le brinda una experiencia cómoda para sentarse.\n"
                    ,
                modifier = Modifier.padding(10.dp))
            Divider()
        }
    }
}