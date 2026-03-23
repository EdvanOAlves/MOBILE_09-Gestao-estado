package com.example.mobile_09_gestao_estado.juros

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mobile_09_gestao_estado.calculos.calcularJuros
import com.example.mobile_09_gestao_estado.calculos.calcularMontante

class JurosScreenViewModel: ViewModel() {
    // criando o objeto que é um estado mutavel
    private val _capitalState = MutableLiveData<String>()

    // coleta o resultado quando alterado(?)
    var capital: LiveData<String> = _capitalState

    private val _taxaState = MutableLiveData<String>()
    var taxa: LiveData<String> = _taxaState

    private val _tempoState = MutableLiveData<String>()
    var tempo: LiveData<String> = _tempoState

    private val _jurosState = MutableLiveData<Double>()
    var juros: LiveData<Double> = _jurosState

    private val _montanteState = MutableLiveData<Double>()
    var montante: LiveData<Double> = _montanteState
    fun onCapitalChange(novoCapital:String){
        _capitalState.value = novoCapital
    }

    fun onTaxaChange(novaTaxa:String){
        _taxaState.value = novaTaxa
    }

    fun onTempoChange(novoTempo: String){
        _tempoState.value = novoTempo
    }

    fun calcularJurosInvestimento(){
        _jurosState.value = calcularJuros(
            capital = _capitalState.value!!.toDouble(),
            taxa = _taxaState.value!!.toDouble(),
            tempo = _taxaState.value!!.toDouble()
        )
    }

    fun calcularMontanteInvestimento(){
        _montanteState.value = calcularMontante(
        capital = _capitalState.value!!.toDouble(),
        juros = _jurosState.value!!)
    }
}