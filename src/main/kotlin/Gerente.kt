class Gerente(
nome: String,
cpf: String,            // <---- Parâmetros herdados da classe Funcionario.
salario: Double,
val senha: String = ""
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    fun autentica(senha: String): Boolean{
        return this.senha == senha
    }

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario;
        }
}