package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.funcionario.Funcionario

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