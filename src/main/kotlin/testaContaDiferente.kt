fun testaContaDiferente() {
    val contaPoupanca = ContaPoupanca(
        titular = "Lucas",
        numero = "1"
    )
    contaPoupanca.deposito(1000.0)
    println("SALDO ANTES DO  SAQUE (POUPANÇA): ${contaPoupanca.saldo}")
    //contaPoupanca.saque(500.0)
    println("SALDO DEPOIS DO  SAQUE (POUPANÇA): ${contaPoupanca.saldo}")
    val contaCorrente = ContaCorrente(
        titular = "Eusebio",
        numero = "1"
    )
    contaCorrente.deposito(1000.0)
    println("SALDO ANTES DO  SAQUE (CORRENTE): ${contaCorrente.saldo}")
    //contaCorrente.saque(500.0)
    println("SALDO DEPOIS DO  SAQUE (CORRENTE): ${contaCorrente.saldo}")

    println("-----------------------------------------------------------------")
    println("SALDO ANTES DE TRANSFERIR (POUPANÇA): ${contaPoupanca.saldo}")
    println("SALDO ANTES DE TRANSFERIR (CORRENTE): ${contaCorrente.saldo}")
    contaCorrente.transfere(100.0, contaPoupanca)
    println("SALDO DEPOIS DE TRANSFERIR (POUPANÇA): ${contaPoupanca.saldo}")
    println("SALDO DEPOIS DE TRANSFERIR (CORRENTE): ${contaCorrente.saldo}")
}