import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.conta.ContaCorrente
import br.com.alura.bytebank.modelo.conta.ContaPoupanca

fun gerenciarConta() {
    //POSSIVEL DEFINIR LABELS - Para qualquer parametro em construtores e funções.
    var clienteJose = Cliente(
        nome = "José",
        cpf = "080.022.111-00",
        senha = "senhaBoa"
    )
    var contaJose = ContaPoupanca(titular = clienteJose, numero = "10")
    contaJose.deposito(100.0)
    contaJose.saque(10.0)
    println(contaJose.saldo)
    //mostrarConta(contaJose)

    var clienteJoao = Cliente(
        nome = "João",
        cpf = "111.222.333-12",
        senha = "senhaBoa123"
    )
    var contaJoao = ContaCorrente(titular = clienteJoao, "20")
    contaJoao.deposito(20.0)
    contaJoao.deposito(5.0)
    println(contaJoao.saldo)
    //mostrarConta(contaJoao)

    if (contaJose.transfere(90.0, contaJoao)) {
        println("Transferência bem sucedida.")
    } else {
        println("Erro na transferência.")
    }

    println("Saldo ${contaJose.titular}: ${contaJose.saldo}")
    println("Saldo ${contaJoao.titular}: ${contaJoao.saldo}")
}