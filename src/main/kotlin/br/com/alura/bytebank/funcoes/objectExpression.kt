package br.com.alura.bytebank.funcoes

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