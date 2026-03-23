package com.example.mobile_09_gestao_estado.components

import android.R.attr.label
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun CaixaDeEntrada(
    label: String,
    placeholder: String,
    keyboardType: KeyboardType,
    modifier: Modifier,
    value:String,
    atualizarValor: (String) -> Unit,
    corApp: Color
    //(String) -> Unit vai dizer que vai receber uma função composable (-> Unit) e o callback vai ser uma string
) {
    OutlinedTextField(
        label = {Text(text = label)},
        placeholder= {Text(text = placeholder)},
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        modifier = modifier,
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = corApp,
            unfocusedBorderColor = corApp
        ),
        value = value,
        shape = CircleShape,
        onValueChange = {
            atualizarValor(it)
        },
    )

}