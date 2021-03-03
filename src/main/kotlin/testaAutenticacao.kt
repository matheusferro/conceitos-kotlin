fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "José",
        cpf = "222.222.222-00",
        salario = 1000.0,
        senha = "senhaForte"
    )
    val diretor = Diretor(
        nome = "Pedro",
        cpf = "111.111.111-01",
        salario = 1000.0,
        senha = "senhaForte",
        plr = 20.0
    )
    val cliente  = Cliente(
        nome = "Jorge",
        cpf = "233.332.123-01",
        senha = "seguranca"
    )
    val sistema = SistemaInterno()
    sistema.entra(gerente, "senha")
    sistema.entra(diretor, "senhaForte")
    sistema.entra(cliente, "seguranca")
}