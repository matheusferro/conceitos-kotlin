package br.com.alura.bytebank.funcoes

import br.com.alura.bytebank.modelo.Endereco

fun main(){
    var endereco: Endereco = Endereco(
        "Rua do meio",
        "157",
        "Centro",
        "Sp",
        "Sp",
        "000000",
        "nenhum"
    )
    var endereco2 = Endereco(
        "Rua do meio",
        "157",
        "Centro",
        "Sp",
        "Sp",
        "000000",
        "nenhum"
    )
    println(endereco.hashCode())
    println(endereco2.hashCode())
    println(endereco.equals(endereco2))

    imprime(endereco)
    imprime("Teste")
    imprime(1601.0)

}

/**
 * Utilizando Objeto ANY
 */
fun imprime(valor: Any):Any{
    println(valor)
    return valor;
}