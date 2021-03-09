package br.com.alura.bytebank.paradigmaFuncional

import br.com.alura.bytebank.modelo.SistemaInterno
import br.com.alura.bytebank.modelo.interfaces.Autenticavel


fun highOrderFunction() {
    soma(107, 2, resultado = {
        //Aqui temos o uso do it
        println(it)
    })
    /**
     * Com reciver vamos ver alterações ao passar uma função lambda
     */
    somaReceiver(107, 2, resultado = {
        //Aqui temos o uso do this
        println(this)

    })

    val autenticavel = object : Autenticavel {
        val senha: String = "senhaSegura"
        override fun autentica(senha: String): Boolean = this.senha == senha
    }
    SistemaInterno().entra(autenticavel, "senhaSegura", autenticado = {
        println("Log-in realizado pela high-order function")
    })
}

fun soma(v1: Int, v2: Int, resultado: (Int) -> Unit) {
    println("Iniciando a soma")
    resultado(v1 + v2)
    println("Fechando a soma")
}

fun somaReceiver(v1: Int, v2: Int, resultado: Int.() -> Unit) {
    println("Iniciando a soma")
    val total = v1 + v2
    total.resultado()
    println("Fechando a soma")
}
