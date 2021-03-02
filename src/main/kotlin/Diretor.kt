class Diretor(nome: String,
              cpf: String,
              salario: Double,
              val senha: String,
              val plr: String) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double
        get() {
            return this.salario * 0.3;
        }

}