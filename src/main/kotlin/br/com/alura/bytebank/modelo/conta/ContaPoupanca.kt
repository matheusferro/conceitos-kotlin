package br.com.alura.bytebank.modelo.conta

import br.com.alura.bytebank.modelo.interfaces.Transferencia
import br.com.alura.bytebank.modelo.Cliente

class ContaPoupanca(
    titular: Cliente,
    numero: String
) : Conta(titular = titular, numero = numero), Transferencia {

    override fun saque(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    override fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saque(valor)
            destino.deposito(valor)
            return true
        }
        return false
    }

}