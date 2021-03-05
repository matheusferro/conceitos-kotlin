package br.com.alura.bytebank.modelo.conta

import br.com.alura.bytebank.modelo.Cliente

class ContaSalario(
    titular: Cliente,
    numero: String
) : Conta(titular = titular, numero = numero) {
    override fun saque(valor: Double) {

    }
}