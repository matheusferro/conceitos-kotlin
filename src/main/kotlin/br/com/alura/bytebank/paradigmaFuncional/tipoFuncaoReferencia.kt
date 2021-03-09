package br.com.alura.bytebank.paradigmaFuncional

fun main(){
    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()
}

fun testaTipoFuncaoReferencia() {
    /**
     * Tipo função:                  () -> Unit
     * Indica Referência da função:  ::
     *
     * Alterado assinatura do método
     */
    val minhaFuncao: (Int, Int) -> Int = ::soma
    //Lazy Evaluation -> Quando a função não é executada quando é inicializada ou indica qual é o seu retorno
    println(minhaFuncao)
    /**
     * Agora sim, estamos executando a função: ()
     *
     * Passando os parâmetros obrigatórios.
     */
    println(minhaFuncao(900,600))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

fun testaTipoFuncaoClasse() {
    /**
     * Podemos fazer a mesma implementação a partir de uma classe
     *
     * Classe do tipo função, tem que implementar o invoke, que vai ser chamado
     * ao executar.
     *
     * Aqui não usamos a referência:        ::      <- Pois não estamos nos tratando de métodos.
     *
     * Alterando a assinatura
     */
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(1,2))
}

/**
 * Nosso tipo função é como se fosse uma interface,
 * a apartir do que foi definido ((a:Int,b:Int)->Unit) é criado o invoke
 *
 * Adicionando parametros
 */
class Soma : (Int, Int) -> Int {

    //Podemos usar: override fun invoke(p1: Int, p2: Int): Int = p1 + p2
    override fun invoke(p1: Int, p2: Int): Int {
        return p1 + p2
    }
}