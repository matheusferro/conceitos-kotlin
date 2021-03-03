package br.com.alura.bytebank.modelo

class Cliente(
    val nome:  String,
    val cpf: String,
    val senha: String,
    val endereco: Endereco = Endereco()
) : Autenticavel {
    override fun autentica(senha: String): Boolean{
        return this.senha == senha
    }
}