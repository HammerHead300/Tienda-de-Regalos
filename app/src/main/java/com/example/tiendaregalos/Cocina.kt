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
fun Cocina(){
    //La linea contiene el titulo del departamiento de la tienda
    Row(modifier = Modifier
        .background(Color.LightGray)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center){
        Text(text = "Cocina", fontSize = 30.sp)
    }
    //Dentro de la LazyColumn introducimos todos los objetos que esten disponibles en el departamento
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {
        item {
            //Definimos el nombre del producto
            Text(text = "Cecotec Batidora de Vaso Power Black Titanium 1800MAX Inox. 1800W Máxima " +
                    "Potencia, Cuchilla de 6 hojas con Recubrimiento de Titanio Negro, 1,5L, 5 " +
                    "Velocidades + Función Pulse y Tapón dosificador", fontSize = 20.sp,
                modifier = Modifier.padding(top = 10.dp))
            //Asignamos la imagen de producto
            Image(
                painterResource(id = R.drawable.batidora), contentDescription = null,
                modifier = Modifier
                    .size(width = 50.dp, height = 100.dp)
                    .padding(top = 10.dp)
            )
            //Asignamos el texto descriptivo del producto
            Text(
                text = "Batidora de vaso con potente motor de 1000 W y 23000 rpm de velocidad. " +
                        "Consigue un triturado óptimo al momento. Cuchilla de 6 hojas diseñadas para" +
                        " generar un movimiento constante de los alimentos y garantizar unos " +
                        "resultados finos y homogéneos en poco tiempo.\n" +
                        "Cuchillas con recubrimiento de titanio negro, máxima dureza y afilado " +
                        "durante más tiempo para triturar todo tipo de alimentos. Jarra de vidrio " +
                        "fundido de alta resistencia con 1,5 litros de capacidad y cómoda boca de " +
                        "vertido para evitar manchas y salpicaduras.\n" +
                        "Dispone de 5 velocidades y función Pulse para adaptarse a las necesidades " +
                        "de todos los alimentos. Capaz triturar y pulverizar a máxima velocidad " +
                        "hasta los alimentos más duros. Pica hielo. Tapa con cierre hermético y " +
                        "tapón dosificador para introducir ingredientes durante el funcionamiento.\n" +
                        "Diseño ergonómico con cuerpo de acero inoxidable. Jarra apta para la " +
                        "limpieza en el lavavajillas. Cuchillas fácilmente desmontables para una " +
                        "limpieza más cómoda. Diseño ergonómico.\n" +
                        "Base antideslizante con diseño Immobile con ventosas para un mejor " +
                        "control. Security Check System: sistema que asegura el funcionamiento " +
                        "solo si el vaso está bien colocado.",
                modifier = Modifier.padding(10.dp)
            )
            Divider()
        }
        item {
            //Definimos el nombre del producto
            Text(text = "Amazon Basics Juego de Utensilios de Cocina de Inducción Sartenes y Wok, " +
                    "Antiadherentes, Acero Inoxidable, 24/28/28 cm, 3 Unidad, Plata",
                fontSize = 20.sp, modifier = Modifier.padding(top = 10.dp))
            //Asignamos la imagen de producto
            Image(
                painterResource(id = R.drawable.sartenes), contentDescription = null,
                modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
                    .padding(top = 10.dp)
            )
            //Asignamos el texto descriptivo del producto
            Text(
                text = "Juego de sartenes de 3 piezas, 24, 28 y 28 cm, cada una con una base ancha " +
                        "y plana y lados acampanados para voltear o girar fácilmente los alimentos.\n" +
                        "Hecho de acero inoxidable duradero con acabado exterior pulido de plata; " +
                        "recubrimiento interior antiadherente de PTFE para liberar alimentos sin " +
                        "esfuerzo.\n" +
                        "Mango de baquelita que no se calienta para levantar y transportar " +
                        "cómodamente; el agujero ofrece una opción cómoda para colgar.\n" +
                        "Mangos para levantar o transportar cómodamente; agujero en el extremo " +
                        "del largo mango para colgarlo y almacenarlo cómodamente.\n" +
                        "Adecuados para todo tipo de fuentes de calor, incluida la inducción, " +
                        "seguros para horno, aptos para el lavavajillas para una limpieza rápida.",
                modifier = Modifier.padding(10.dp)
            )
            Divider()
        }
        item {
            //Definimos el nombre del producto
            Text(text = "COSORI Freidora de Aire Turbo Blaze", fontSize = 20.sp,
                modifier = Modifier.padding(top = 10.dp))
            //Asignamos la imagen de producto
            Image(painterResource(id = R.drawable.freidora), contentDescription = null,
                modifier = Modifier
                    .size(width = 50.dp, height = 100.dp)
                    .padding(top = 10.dp))
            //Asignamos el texto descriptivo del producto
            Text(text = "[Tecnología innovadora de COSORI, su revolucionario aparato de cocina]" +
                    " Después de 2 años de innovación tecnológica, la freidora de aire COSORI" +
                    " TurboBlaze es la primera en incorporar Tecnología de Motor DC segura," +
                    " brindandole una experiencia de cocción que supera a las generaciones " +
                    "anteriores de freidoras, que la hace la mejor opción de freidora de aire.\n" +
                    "[Acelera cocción en un 46%, ahorra tiempo y energía] El Motor DC equipado " +
                    "mejora la eficiencia de la circulación del aire, reduciendo el tiempo de " +
                    "cocción en un 46% y ahorrando gastos de energía. Deje que TurboBlaze alivie " +
                    "su ansiedad por las facturas.",
                modifier = Modifier.padding(10.dp))
            Divider()
        }
        item {
            //Definimos el nombre del producto
            Text(text = "Russell Hobbs Cafetera de Goteo Textures Plus", fontSize = 20.sp,
                modifier = Modifier.padding(top = 10.dp))
            //Asignamos la imagen de producto
            Image(painterResource(id = R.drawable.cafetera), contentDescription = null,
                modifier = Modifier
                    .size(width = 50.dp, height = 100.dp)
                    .padding(top = 10.dp))
            //Asignamos el texto descriptivo del producto
            Text(text = "Acabado de alta gama que combina dos texturas de negro: esmerilado y" +
                    " brillante.\n" +
                    "Ducha de pulverización de tecnología avanzada combinada con una temperatura" +
                    " óptima para extraer todos los aromas del café.\n" +
                    "Gran capacidad de 1,25 litros, 10 tazas grandes.\n" +
                    "Soporte de filtro extraíble para un fácil mantenimiento.\n" +
                    "Sistema antigoteo para usar en cualquier momento.",
                modifier = Modifier.padding(10.dp))
            Divider()
        }
    }
}