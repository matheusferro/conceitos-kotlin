import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContaDiferente() {
    var clienteLucas = Cliente(
        nome = "Lucas",
        cpf = "333.222.111-01",
        senha = "senha"
    )
    val contaPoupanca = ContaPoupanca(
        titular = clienteLucas,
        numero = "1"
    )
    contaPoupanca.deposito(1000.0)
    println("SALDO ANTES DO  SAQUE (POUPANÇA): ${contaPoupanca.saldo}")
    //contaPoupanca.saque(500.0)
    println("SALDO DEPOIS DO  SAQUE (POUPANÇA): ${contaPoupanca.saldo}")
    var clienteEusebio = Cliente(
        nome = "Eusebio",
        cpf = "321.333.123-01",
        senha = "senha321"
    )
    val contaCorrente = ContaCorrente(
        titular = clienteEusebio,
        numero = "1"
    )
    contaCorrente.deposito(1000.0)
    println("SALDO ANTES DO  SAQUE (CORRENTE): ${contaCorrente.saldo}")
    //contaCorrente.saque(500.0)
    println("SALDO DEPOIS DO  SAQUE (CORRENTE): ${contaCorrente.saldo}")

    println("-----------------------------------------------------------------")
    println("SALDO ANTES DE TRANSFERIR (POUPANÇA): ${contaPoupanca.saldo}")
    println("SALDO ANTES DE TRANSFERIR (CORRENTE): ${contaCorrente.saldo}")
    contaCorrente.transfere(100.0, contaPoupanca)
    println("SALDO DEPOIS DE TRANSFERIR (POUPANÇA): ${contaPoupanca.saldo}")
    println("SALDO DEPOIS DE TRANSFERIR (CORRENTE): ${contaCorrente.saldo}")
}