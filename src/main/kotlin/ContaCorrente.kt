class ContaCorrente(
    titular: String, numero: String

) : Conta(titular = titular, numero = numero) {

    override fun saque(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valor) {
            this.saldo -= valorComTaxa;
        }
    }
}