package br.com.alura.bytebank.modelo

class Cliente(
    val nome:  String,
    val cpf: String,
    val senha: String
) : Autenticavel {
    override fun autentica(senha: String): Boolean{
        return this.senha == senha
    }
}