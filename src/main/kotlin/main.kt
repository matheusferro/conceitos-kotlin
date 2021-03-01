fun main(args: Array<String>) {
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
    for (i in -1..3) {                                  //RANGES. POSSIVEL USAR O "downTo" , step, until,
        val titular: String = "José"
        val numeroConta: String = "0020.01010.00-1"
        var saldo: Double = 1000.0
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

fun avaliaSaldo(saldo: Double) {
    /**
     * IF tradicional

    if(saldo < 0) {
        println("Saldo negativo: $saldo")
    }else if(saldo == 0.0){
        println("Saldo neutro: $saldo")
    }else{
        println("Saldo positivo: $saldo")
    }

     */
    /**
     * Estrutura WHEN (RECOMENDADA)
     */
    when {
        saldo < 0 -> println("Saldo negativo: $saldo")
        saldo == 0.0 -> println("Saldo neutro: $saldo")
        else -> println("Saldo positivo: $saldo")
    }

}