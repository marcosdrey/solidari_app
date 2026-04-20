package br.com.fiap.solidarizeapp // TODO: ajuste conforme o package do seu projeto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import br.com.fiap.solidarizeapp.screens.LoginScreen
import br.com.fiap.solidarizeapp.screens.CashbackScreen
import br.com.fiap.solidarizeapp.ui.theme.SolidarizeAppTheme
import br.com.fiap.solidarizeapp.screens.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            SolidarizeAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    CashbackScreen()
                }
            }
        }
    }
}

