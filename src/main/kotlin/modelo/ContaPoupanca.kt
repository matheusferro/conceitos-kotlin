package modelo

class ContaPoupanca(
    titular: String,
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