import br.com.alura.bytebank.modelo.totalContas
import java.lang.String as StringJava

fun main() {
    println("Bem vindo ao bytebank")
    gerenciarConta()
    testaFuncionarios()
    testaContaDiferente()
    testaAutenticacao()

    println("Temos $totalContas contas.")
    val palavra: String = ""
    //Utilizando String da biblioteca java
    val palavraJava: java.lang.String = java.lang.String("")//nome completo
    val palavraJava2: StringJava = StringJava("")// utilizando apelido para o pacote, definido com o 'as'
}