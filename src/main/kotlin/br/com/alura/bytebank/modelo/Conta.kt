package br.com.alura.bytebank.modelo

/**
 * Utilizando construtor primário.
 *
 * Possivel definir valor inicial para variaveis
 * EX: val numero: String = "0"
 */

//Definindo Variavel global
var totalContas = 0
    private set

abstract class Conta(
    val titular: Cliente,
    val numero: String
) {
    var saldo: Double = 0.0
        protected set

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