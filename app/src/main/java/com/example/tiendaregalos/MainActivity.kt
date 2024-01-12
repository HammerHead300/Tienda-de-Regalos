package com.example.tiendaregalos

import android.graphics.Paint.Align
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch
import java.util.logging.LogManager

// definicion de la clase
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mostrar()
        }
    }
}

//Funcion principal de la clase MainActivity
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun mostrar() {
    //Estado en el que se encuentra el navegador (Abierto o cerrado)
    val estado = rememberDrawerState(initialValue = DrawerValue.Closed)
    //Corutina de la accion que va a realizar la funcion
    val accion = rememberCoroutineScope()
    //Define la zona actual del navegador
    var actual by remember() {
        mutableStateOf(0)
    }
    //Controlador del navegador
    val controlador = rememberNavController()
    //Host de navegacion en la que definimos los diferentes destinos de la navegacion que
    //corresponden con las diferentes clases
    NavHost(navController = controlador, startDestination = "hogar"){
        composable("hogar"){
            Hogar()
        }
        composable("electronica"){
            Electronica()
        }
        composable("ropa"){
            Ropa()
        }
        composable("cocina"){
            Cocina()
        }
        composable("juguetes"){
            Juguetes()
        }
        composable("decoracion"){
            Decoracion()
        }
    }
    //Barra lateral de navegacion desplegable
    ModalNavigationDrawer(
        drawerState = estado,
        drawerContent = { //Contenido
            ModalDrawerSheet {
                ListItem(
                    headlineText = {Text("Departamentos")},
                    leadingContent = {
                        IconButton(onClick = {
                            accion.launch {estado.close()}
                        }) {
                            Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu")
                        }
                    }
                )
                //Creamos un divisor y despues del mismo creamos cada "item" del navegador
                Divider()
                NavigationDrawerItem(
                    label = { Text(text = "Hogar") },
                    selected = (actual == 0),
                    onClick = {
                        accion.launch { estado.close() }
                        actual = 0
                        controlador.navigate("hogar")
                    }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Electrónica") },
                    selected = (actual == 1),
                    onClick = {
                        accion.launch { estado.close() }
                        actual = 1
                        controlador.navigate("electronica")
                    }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Ropa") },
                    selected = (actual == 2),
                    onClick = {
                        accion.launch { estado.close() }
                        actual = 2
                        controlador.navigate("ropa")
                    }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Cocina") },
                    selected = (actual == 3),
                    onClick = {
                        accion.launch { estado.close() }
                        actual = 3
                        controlador.navigate("cocina")
                    }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Juguetes") },
                    selected = (actual == 4),
                    onClick = {
                        accion.launch { estado.close() }
                        actual = 4
                        controlador.navigate("juguetes")
                    }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Decoración") },
                    selected = (actual == 5),
                    onClick = {
                        accion.launch { estado.close() }
                        actual = 5
                        controlador.navigate("decoracion")
                    }
                )
            }
        }) {
        //Lo que se muestra en pantalla
        Scaffold(
            //Barra superior
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = "Tienda")
                    },
                    navigationIcon = {
                        IconButton(onClick = {
                            accion.launch { estado.open() }
                        }) {
                            Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu")
                        }
                    },
                )
            }
        ){innerPadding ->
            //Como se va a mostrar la barra de navegación lateral
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if(actual == 0) {
                    Hogar()
                } else if(actual == 1) {
                    Electronica()
                } else if(actual == 2) {
                    Ropa()
                } else if(actual == 3) {
                    Cocina()
                } else if(actual == 4) {
                    Juguetes()
                } else if(actual == 5) {
                    Decoracion()
                }
            }
        }
    }
}
