package br.com.alura.bytebank.modelo

class Gerente(
nome: String,
cpf: String,            // <---- Parâmetros herdados da classe br.com.alura.bytebank.modelo.Funcionario.
salario: Double,
senha: String
) : FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha) {

    override val bonificacao: Double
        get() {
            return  salario;
        }
}