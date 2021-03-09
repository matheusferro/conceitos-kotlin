fun main() {

    val funcaoLambda: (Int, Int) -> Int = { a, b ->
        println("Executando lambda")
        a + b //em uma função lambda a ultima instrução determina o retorno.
    }

    println(funcaoLambda(20, 7))

    val funcaoAnonima: () -> Unit = fun (){
        println("Executando função anonima")
    }
    println(funcaoAnonima())
}