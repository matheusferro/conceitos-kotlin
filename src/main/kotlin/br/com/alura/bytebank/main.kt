import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.conta.ContaPoupanca

fun main() {

}

fun testaRun() {
    val taxaAnual: Double = 15.00
    val taxaMensal: Double = taxaAnual / 12.0
    println("Taxa mensal: $taxaMensal")

    val contaPoupanca: ContaPoupanca =
        ContaPoupanca(Cliente(nome = "João", cpf = "111.222.333-12", senha = "senhaBoa123"), "1011102-20002-1")
    contaPoupanca
        .run {
            deposito(2000.0)
            saldo * taxaMensal
        }.let { println("Rendimento mensal ") }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) { indice ->
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println(rendimentoAnual)
}

fun testeWith() {
    with(Endereco()) {
        logradouro = "Rua das Margaridas"
        numero = "100"
        bairro = "Centro"
        cep = "00000-000"
        cidade = "São Paulo"
        estado = "SP"
        formatar()
    }.let(::println);
}