import br.com.alura.bytebank.modelo.conta.Conta

fun mostrarConta(conta: Conta) {
    /**
     * Toda variável deve ser iniciada.
     * Variáveis Imutáveis          = val
     * Variáveis Mutáveis           = var
     */

    /**
     * LOOPS
     *
     * 1-FOR:
     */
    val titular: String = conta.titular.nome
    val numeroConta: String = conta.numero
    var saldo: Double = conta.saldo
    for (i in -1..3) {//RANGES. POSSIVEL USAR O "downTo" , step, until,
        saldo *= i

        //String Template
        println("Bem vindo ao ByteBank! $titular")
        println("Número da conta: $numeroConta")
        avaliaSaldo(saldo)
    }

    /**
     * 2-WHILE:
     */
    var j: Int = 0
    while (j != 3) {
        println(j)
        j++
    }
    println("-----------")
    /**
     * 3-DO WHILE:
     */
    do {
        println(j)
        j++
    } while (j != 6)
    println("-----------")
    /**
     * 4-ITERATORS:
     */
    val it = listOf<String>("teste1", "teste2", "teste3", "teste4").iterator()
    for (teste in it) {
        println(teste)
    }
}