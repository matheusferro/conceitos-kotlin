package br.com.alura.bytebank.modelo

class ContaSalario(
    titular: Cliente,
    numero: String
) : Conta(titular = titular, numero = numero) {
    override fun saque(valor: Double) {

    }
}