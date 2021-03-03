fun main() {
    println("Bem vindo ao bytebank")
    gerenciarConta()
    testaFuncionarios()
    testaContaDiferente()

    val gerente = Gerente(
        nome = "José",
        cpf = "222.222.222-00",
        salario = 1000.0,
        senha = "senhaForte"
    )
    val diretor = Diretor(
        nome = "José",
        cpf = "222.222.222-01",
        salario = 1000.0,
        senha = "senhaForte",
        plr = 20.0
    )
    val sistema = SistemaInterno()
    sistema.entra(gerente, "senha")
    sistema.entra(diretor, "senhaForte")
}

