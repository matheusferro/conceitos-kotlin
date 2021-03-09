fun main() {

    val funcaoLambda = { a: Int, b: Int ->
        println("Executando lambda")
        a + b //em uma função lambda a ultima instrução determina o retorno.
    }

    println(funcaoLambda(20, 7))

    /**
     * Consideramos a função anonima, quando queremos deixar explicito
     * o que queremos colocar como parâmetro, retorno e o escopo de execução
     * do código.
     */
    val funcaoAnonima: (Int, Int) -> Int = fun (a, b): Int{
        println("Executando função anonima")
        return a + b //necessário colocar o return
    }
    println(funcaoAnonima(201,783))

    /**
     * Multiplos retornos em uma função lambda.
     */
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        //Quando temos somente um parâmetro, podemos acessar ele com: it
        //if(it > 2000.0){
        if(salario > 2000.0){
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

    //Implementação com função anonima
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario: Double):Double{
        if(salario > 2000.0){
            return salario + 100.0
        }
        return salario + 500.0
    }
    println(calculaBonificacaoAnonima(3000.0))
}