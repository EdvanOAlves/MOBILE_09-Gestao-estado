package com.example.mobile_09_gestao_estado.components

import android.R.attr.label
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun CaixaDeEntrada(
    label: String,
    placeholder: String,
    keyboardType: KeyboardType,
    modifier: Modifier,
    value:String,
    atualizarValor: (String) -> Unit
    //(String) -> Unit vai dizer que vai receber uma função composable (-> Unit) e o callback vai ser uma string
) {
    OutlinedTextField(
        label = {Text(text = label)},
        placeholder= {Text(text = placeholder)},
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        modifier = modifier,
        value = value,
        onValueChange = {
            atualizarValor(it)
        }
    )

}

/*
*                         OutlinedTextField(
                            value = capital,
                            onValueChange = { capital = it },
                            modifier = Modifier.fillMaxWidth(),
                            label = { Text(text = "Valor investimento") },
                            placeholder = { Text(text = "Quanto deseja investir?") },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal)
                        )
* */