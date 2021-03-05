import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.objectExpression
import java.lang.String as StringJava

fun main() {
//    println("Bem vindo ao bytebank")
//    gerenciarConta()
//    testaFuncionarios()
//    testaContaDiferente()
//    testaAutenticacao()
//    objectExpression()
//    println("Temos ${Conta.totalContas} contas.")
//    val palavra: String = ""
//    //Utilizando String da biblioteca java
//    val palavraJava: java.lang.String = java.lang.String("")//nome completo
//    val palavraJava2: StringJava = StringJava("")// utilizando apelido para o pacote, definido com o 'as'
//

    /**
     * Lidando com null
     */
    var enderecoNull: Endereco? = null

    /**
     * Não conseguimos acessar os membros de objetos que podem ser
     * nullos, então "transformamos" o objeto para não nulo com: !!
     */
    var enderecoNaoNull: Endereco = enderecoNull!!
    println(enderecoNaoNull.bairro);
}