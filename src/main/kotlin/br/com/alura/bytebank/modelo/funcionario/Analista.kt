package br.com.alura.bytebank.modelo.funcionario

import br.com.alura.bytebank.modelo.funcionario.Funcionario

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
            get(){
                return salario * 0.05
            }
}