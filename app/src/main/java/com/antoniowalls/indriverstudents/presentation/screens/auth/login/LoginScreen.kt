package com.antoniowalls.indriverstudents.presentation.screens.auth.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.antoniowalls.indriverstudents.R

@Composable
fun LoginScreen() {
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Scaffold (
        contentWindowInsets = WindowInsets.navigationBars
    ){ paddingValues -> //aquí se diseña  como si fuera un HTML
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(0xFFAC9E1F), Color(0xFFFFE91F))
                    )
                )
                .padding(paddingValues)
        ) {
            Column(
                //con esto vas a usar toda la altura disponible, centras los elemento de manera vertical y en la parte inicial de manera horizontal que sería a la izquierda
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Login",
                    color = Color.White,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.rotate(90f).padding(top = 10.dp)
                )
                //se usa dp para anchuras, alturas y todito lo que tiene que ver con dimensiones
                //sp para el tamaño de fuente
                Spacer(modifier = Modifier.height(150.dp))
                Text(
                    text = "Registro",
                    color = Color.White,
                    fontSize = 27.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.rotate(90f).padding(top = 30.dp)
                )
                Spacer(modifier = Modifier.height(250.dp))
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 60.dp, bottom = 35.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(0xFF871EFE), Color(0xFFF3CE00))
                    ),
                    shape = RoundedCornerShape(
                        topStart = 35.dp,
                        bottomStart = 35.dp
                    )
                )

        ) {
            Column(
                modifier = Modifier.statusBarsPadding()
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Bienvenido!",
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Regresa...",
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Medium
                )
                Image(
                    modifier = Modifier.size(150.dp),
                    painter = painterResource(id = R.drawable.car_white),
                    contentDescription = null,
                )
                Text(
                    text = "Log in...",
                    color = Color.White,
                    fontSize = 27.sp,
                    fontWeight = FontWeight.Medium
                )
                TextField(
                    value = email,
                    onValueChange = {
                        email = it
                    },
                    label = { Text("Correo electrónico") },
                )
                TextField(
                    value = password,
                    onValueChange = {
                        password = it
                    },
                    label = { Text("Contraseña") },
                )
                Button(
                    onClick = { }
                ) {
                    Text("Iniciar sesión")
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ){
                    Spacer(modifier = Modifier
                        .width(25.dp)
                        .height(1.dp)
                        .background(Color.White)
                    )
                    Text(
                        text = "O",
                        color = Color.White,
                        fontSize = 17.sp,
                    )
                    Spacer(modifier = Modifier
                        .width(25.dp)
                        .height(1.dp)
                        .background(Color.White)
                    )

                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ){
                    Text(
                        text = "No tienes cuenta?",
                        color = Color.White,
                        fontSize = 17.sp,
                    )
                    Text(
                        text = "registrate?",
                        color = Color.White,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

    }
}



//ESTA COSA ES SOLO PARA VER UN PREVIEW
@Preview(
    showBackground = true, // Muestra un fondo predeterminado para el Composable.
    name = "Login Screen Preview" // Nombre opcional para la vista previa.
    // Puedes añadir más parámetros como:
    // device = Devices.PIXEL_4 // Previsualizar en un dispositivo específico
    // uiMode = Configuration.UI_MODE_NIGHT_YES // Previsualizar en modo oscuro
)
@Composable
fun DefaultPreview() {
    // Es común crear una función Composable separada solo para la vista previa,
    // que simplemente llama a tu Composable principal.
    // Aquí podrías envolver LoginScreen con un tema si tu app lo usa.
    // Ejemplo: TuAppTheme { LoginScreen() }
    LoginScreen()
}