import br.com.alura.bytebank.modelo.Conta
import java.lang.String as StringJava

fun main() {
    println("Bem vindo ao bytebank")
    gerenciarConta()
    testaFuncionarios()
    testaContaDiferente()
    testaAutenticacao()
    //objectExpression()
    println("Temos ${Conta.totalContas} contas.")
    val palavra: String = ""
    //Utilizando String da biblioteca java
    val palavraJava: java.lang.String = java.lang.String("")//nome completo
    val palavraJava2: StringJava = StringJava("")// utilizando apelido para o pacote, definido com o 'as'
}

fun objectExpression() {
    /**
     * Object expressions:
     * normalmente usado para android na ação de um botão:
     *
     * window.addMouseListener(object : MouseAdapter() {
     *      override fun mouseClicked(e: MouseEvent) { /*...*/ }
     *      override fun mouseEntered(e: MouseEvent) { /*...*/ }
     * })
     *
     */
    var objCliente = object {
        val nome: String = "clienteObj"
        val cpf: String = "112.221.331-00"
        val senha: String = "senhaBoaESegura"

        fun autentica(senha: String) = this.senha == senha
    }
    println("nome: ${objCliente.nome}")
    println("cpf: ${objCliente.cpf}")
    println(objCliente.autentica("senha123"))
}