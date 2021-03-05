package br.com.alura.bytebank.modelo.interfaces

import br.com.alura.bytebank.modelo.conta.Conta

interface Transferencia {
    fun transfere(valor: Double, destino: Conta): Boolean
}
