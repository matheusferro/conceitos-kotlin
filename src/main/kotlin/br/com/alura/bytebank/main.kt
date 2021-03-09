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
}