import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.funcionario.Diretor
import br.com.alura.bytebank.modelo.funcionario.Gerente

fun testaFuncionarios() {
    /**
     * Alterado classe br.com.alura.bytebank.modelo.funcionario.Funcionario para abstrata
     * Como 'funcionario' não é uma entidade concreta, utilizamos só  gerente,
     * diretor e etc...
     */
    val funcionario = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = "senhaForte"
    )

    println("nome: ${funcionario.nome}")
    println("cpf: ${funcionario.cpf}")
    println("salário: ${funcionario.salario}")
    println("bonificação: ${funcionario.bonificacao}")
    println("-----------------------------------------")

    val gerente = Gerente(
        nome = "Jorge",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = "1234"
    )
    println("nome: ${gerente.nome}")
    println("cpf: ${gerente.cpf}")
    println("salário: ${gerente.salario}")
    println("bonificação: ${gerente.bonificacao}")
    println("-----------------------------------------")

    val diretor = Diretor(
        nome = "Jorge",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = "1234",
        plr = 100.0,
    )
    println("nome: ${diretor.nome}")
    println("cpf: ${diretor.cpf}")
    println("salário: ${diretor.salario}")
    println("bonificação: ${diretor.bonificacao}")


    /**
     * Aplicando conceito de polimorfismo.
     */
    val calculadora = CalculadoraBonificacao()
    calculadora.registra(funcionario)
    calculadora.registra(gerente)
    calculadora.registra(diretor)
}