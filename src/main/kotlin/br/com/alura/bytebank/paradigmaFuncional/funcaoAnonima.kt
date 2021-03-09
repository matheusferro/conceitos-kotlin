package br.com.alura.bytebank.paradigmaFuncional


fun funcaoAnonima() {
    /**
     * Consideramos a função anonima, quando queremos deixar explicito
     * o que queremos colocar como parâmetro, retorno e o escopo de execução
     * do código.
     */
    val funcaoAnonima: (Int, Int) -> Int = fun(a, b): Int {
        println("Executando função anonima")
        return a + b //necessário colocar o return
    }
    println(funcaoAnonima(201, 783))

    //Implementação com função anonima
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario: Double): Double {
        if (salario > 2000.0) {
            return salario + 100.0
        }
        return salario + 500.0
    }
    println(calculaBonificacaoAnonima(3000.0))
}