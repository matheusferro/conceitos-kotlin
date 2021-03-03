package modelo

import modelo.Conta

class ContaSalario(
    titular: String,
    numero: String
) : Conta(titular = titular, numero = numero) {
    override fun saque(valor: Double) {

    }
}