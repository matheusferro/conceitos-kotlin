package modelo

import modelo.Funcionario

class CalculadoraBonificacao() {
    var total: Double = 0.0
        private set

    /**
     * Aplicando conceito de polimorfismo.
     */
    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }
}