fun main(args: Array<String>) {
    var contaJose = Conta()
    contaJose.titular = "José"
    contaJose.deposito(100.0)
    contaJose.saque(10.0)
    println(contaJose.saldo)
    //mostrarConta(contaJose)

    var contaJoao = Conta()
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

class Conta() {
    var titular: String = "João"
    var numero: String = "11120222"
    var saldo: Double = 0.0
        private set

    /**
     * GETTERS E SETTERS PODEM SER UTILIZADOS COMO PROPERTUIES
     *
     *  EX:
     *      var teste = "teste"
     *          set(value: String){
     *              if(value){
     *                  field = value
     *              }
     *          }
     *          private get
     */

    fun deposito(valor: Double) {
        this.saldo += valor
    }

    fun saque(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposito(valor)
            return true
        }
        return false
    }
}

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
    val titular: String = conta.titular
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