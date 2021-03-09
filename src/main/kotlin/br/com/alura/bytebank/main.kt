fun main() {
    val funcaoLambda: () -> Unit = {
        println("Executando lambda")
    }
    println(funcaoLambda())

    val funcaoAnonima: () -> Unit = fun (){
        println("Executando função anonima")
    }
    println(funcaoAnonima())
}