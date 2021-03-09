package br.com.alura.bytebank.funcoes

import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.conta.Conta
import gerenciarConta
import testaAutenticacao
import testaContaDiferente
import testaFuncionarios

private fun recursoDaLinguagem() {
    println("Bem vindo ao bytebank")
    gerenciarConta()
    testaFuncionarios()
    testaContaDiferente()
    testaAutenticacao()
    objectExpression()
    exceptions()
    println("Temos ${Conta.totalContas} contas.")
    val palavra: String = ""
    //Utilizando String da biblioteca java
    val palavraJava: java.lang.String = java.lang.String("")//nome completo
    val palavraJava2: java.lang.String = java.lang.String("")// utilizando apelido para o pacote, definido com o 'as'

    testeNulls()
}

fun testeNulls() {
    /**
     * Lidando com null
     *
     * Não conseguimos acessar os membros de objetos que podem ser
     * nullos, então "transformamos" o objeto para não nulo com: !!
     *
     * var enderecoNaoNull: Endereco = endereco!!
     */
    var endereco: Endereco? = null
    //var endereco: Endereco? = Endereco("logradouro")
    /**
     * Safe call
     */
    //Verifica se o objeto esta null para realizar a chamada
    println(endereco?.logradouro);

    //Variaveis de ambiente
    endereco?.let { end: Endereco ->
        println(end.logradouro)
    }
    /**
     * Elvis operator
     */
    val logradouroSize: Int = endereco?.bairro?.length ?: -1
    println(logradouroSize)
}