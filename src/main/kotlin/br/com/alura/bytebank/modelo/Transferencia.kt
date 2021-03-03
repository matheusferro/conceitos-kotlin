package br.com.alura.bytebank.modelo

interface Transferencia {
    fun transfere(valor: Double, destino: Conta): Boolean
}
