fun gerenciarConta() {
    //POSSIVEL DEFINIR LABELS - Para qualquer parametro em construtores e funções.
    var contaJose = ContaPoupanca(titular = "José", numero = "10")
    contaJose.deposito(100.0)
    contaJose.saque(10.0)
    println(contaJose.saldo)
    //mostrarConta(contaJose)

    var contaJoao = ContaCorrente("João", "20")
    contaJoao.deposito(20.0)
    contaJoao.deposito(5.0)
    println(contaJoao.saldo)
    //mostrarConta(contaJoao)

    if (contaJose.transfere(90.0, contaJoao)) {
        println("Transferência bem sucedida.")
    } else {
        println("Erro na transferência.")
    }

    println("Saldo ${contaJose.titular}: ${contaJose.saldo}")
    println("Saldo ${contaJoao.titular}: ${contaJoao.saldo}")
}