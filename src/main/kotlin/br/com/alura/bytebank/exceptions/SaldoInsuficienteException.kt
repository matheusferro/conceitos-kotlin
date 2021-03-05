package br.com.alura.bytebank.exceptions

/**
 * Adicionando uma exception que pode receber uma mensagem personalizada.
 */
class SaldoInsuficienteException(mensagem:String = "Saldo insufisiente."): Exception(mensagem)