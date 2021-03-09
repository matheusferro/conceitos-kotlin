fun main() {
    /**
     * Tipo função:                  () -> Unit
     * Indica Referência da função:  ::
     */
    val minhaFuncao: () -> Unit = ::teste
    //Lazy Evaluation -> Quando a função não é executada quando é inicializada ou indica qual é o seu retorno
    println(minhaFuncao)
    //Agora sim, estamos executando a função: ()
    println(minhaFuncao())

    /**
     * Podemos fazer a mesma implementação a partir de uma classe
     *
     * Classe do tipo função, tem que implementar o invoke, que vai ser chamado
     * ao executar.
     *
     * Aqui não usamos a referência:        ::      <- Pois não estamos nos tratando de métodos.
     */
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())

}

fun teste() {
    println("Função executada!")
}

/**
 * Nosso tipo função é como se fosse uma interface,
 * a apartir do que foi definido ((a:Int,b:Int)->Unit) é criado o invoke
 */
class Teste : () -> Unit {
    override fun invoke() {
        println("Utilizando classe")
    }
}