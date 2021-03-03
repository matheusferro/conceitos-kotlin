package br.com.alura.bytebank.modelo

class ContaCorrente(
    titular: Cliente,
    numero: String

) : Conta(titular = titular, numero = numero), Transferencia {

    override fun saque(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valor) {
            this.saldo -= valorComTaxa;
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