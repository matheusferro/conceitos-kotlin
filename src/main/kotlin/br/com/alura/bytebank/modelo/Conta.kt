package br.com.alura.bytebank.modelo

/**
 * Utilizando construtor primário.
 *
 * Possivel definir valor inicial para variaveis
 * EX: val numero: String = "0"
 */

abstract class Conta(
    val titular: Cliente,
    val numero: String
) {
    var saldo: Double = 0.0
        protected set

    /**
     * Definindo um COMPANION OBJECT.
     * COMPANION    -> Permite compartilhar o objeto com a classe
     * OBJECT       -> DEFINE UM OBJETO COM O NOME 'CONTADOR'
     *
     * Esse objeto substituiu a variavel global, pois com ele tinhamos varias falhas
     * com outras classes podendo realizar a modificação. Agora somente a classe Conta
     * manipula o valor do objeto e todas as outras classes conseguem acessar por meio
     * de: Conta.totalContas.
     */
    companion object Contador{
        var totalContas = 0
            private set
    }
    //BLOCO EXECUTADO TODA VEZ QUE A CLASSE É INSTANCIADA
    init{
        totalContas++
    }

    /**
     * Construtor secundário

    constructor(titular: String, numero: String) : this() {
    this.titular = titular
    this.numero = numero
    }
     */
    /**
     * GETTERS E SETTERS PODEM SER UTILIZADOS COMO PROPERTUIES
     *
     *  EX:
     *      var br.com.alura.bytebank.teste = "br.com.alura.bytebank.teste"
     *          set(value: String){
     *              if(value){
     *                  field = value
     *              }
     *          }
     *          private get
     */

    fun deposito(valor: Double) {
        this.saldo += valor
    }

    abstract fun saque(valor: Double)

}