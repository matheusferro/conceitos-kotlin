package br.com.alura.bytebank.funcoes

import br.com.alura.bytebank.exceptions.SaldoInsuficienteException

fun exceptions() {
    println("início main")
    funcao1()

    //Utilizando expressões
    val x = "0"

    var y: Double? = try {
        x.toDouble()
    } catch (excep: Exception) {
        null
    }

    y = if (y == null) {
        42.0
    } else {
        0.0
    }

    println("O valor de x: $x")
    println("O valor de y: $y")
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    //Tratando exceptions
    try {
        funcao2()
    } catch (expEspecifica: ArithmeticException) {
        println(" Ocorreu um erro: ArithmeticException. ")
        expEspecifica.printStackTrace()
    } catch (expSaldo: SaldoInsuficienteException) {
        println(" Ocorreu um erro: SaldoInsuficienteException. ")
    } catch (expGeral: Exception) {
        println(" Ocorreu um erro desconhecido. ")
        expGeral.printStackTrace()
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}