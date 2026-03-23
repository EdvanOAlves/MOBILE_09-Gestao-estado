package com.example.mobile_09_gestao_estado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.mobile_09_gestao_estado.juros.JurosScreen
import com.example.mobile_09_gestao_estado.juros.JurosScreenViewModel
import com.example.mobile_09_gestao_estado.ui.theme.MOBILE_09_GestaoEstadoTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MOBILE_09_GestaoEstadoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    JurosScreen(
                        modifier = Modifier.padding(innerPadding),
                        jurosScreenViewModel = JurosScreenViewModel()
                    )
                }
            }
        }
    }
}