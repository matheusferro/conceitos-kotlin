/**
 * Utilizando construtor primário.
 *
 * Possivel definir valor inicial para variaveis
 * EX: val numero: String = "0"
 */
abstract class Conta(val titular: String, val numero: String) {
    var saldo: Double = 0.0
        protected set

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
     *      var teste = "teste"
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

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saque(valor)
            destino.deposito(valor)
            return true
        }
        return false
    }
}