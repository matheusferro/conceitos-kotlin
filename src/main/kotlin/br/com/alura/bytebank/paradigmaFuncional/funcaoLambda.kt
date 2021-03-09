package br.com.alura.bytebank.paradigmaFuncional

fun funcaoLambda() {
    val funcaoLambda = { a: Int, b: Int ->
        println("Executando lambda")
        a + b //em uma função lambda a ultima instrução determina o retorno.
    }

    println(funcaoLambda(20, 7))

    /**
     * Multiplos retornos em uma função lambda.
     */
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        //Quando temos somente um parâmetro, podemos acessar ele com: it
        //if(it > 2000.0){
        if (salario > 2000.0) {
            /**
             * Não podemos utlizar somente return it + 500.0
             * pois retornaria para nossa função main diretamente
             * então utilizamos o recurso de "returns and jumps"
             * https://kotlinlang.org/docs/returns.html
             */
            return@lambda salario + 100.0//
        }
        //Aqui é opcional
        return@lambda salario + 500.0
    }
    println(calculaBonificacao(3000.0))
}