import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno
import br.com.alura.bytebank.modelo.interfaces.Autenticavel

fun main() {

    val testeFuncao: () -> Unit
    //let -> Utiliza generics
    //Objeto Endereco
    //val endereco: Endereco = Endereco(logradouro = "Rua do meio", numero = "465")
    //val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    //println(enderecoEmMaiusculo)

    val enderecoEmMaiusculo = Endereco(logradouro = "Rua do meio", numero = "465")
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let(::println)

    listOf(
        Endereco(complemento = "Bloco 07"),
        Endereco(),
        Endereco(complemento = "Casa")
    ).filter { endereco -> endereco.complemento.isNotEmpty() }
        .let(::println)

    soma(107, 2, resultado = (::println))

    val autenticavel = object : Autenticavel{
        val senha: String = "senhaSegura"
        override fun autentica(senha: String): Boolean = this.senha == senha
    }
    SistemaInterno().entra(autenticavel, "senhaSegura", autenticado ={
        println("Log-in realizado pela high-order function")
    })
}

fun soma(v1: Int, v2: Int, resultado: (Int) -> Unit) {
    println("Iniciando a soma")
    resultado(v1 + v2)
    println("Fechando a soma")
}
