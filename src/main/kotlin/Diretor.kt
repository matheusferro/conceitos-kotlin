class Diretor(nome: String,
              cpf: String,
              salario: Double,
              val senha: String,
              val plr: Double) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double
        get() {
            return salario + plr;
        }

}