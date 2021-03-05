package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.interfaces.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: String){
        if(admin.autentica(senha)){
            println("Bem vindo ao bytebank")
        }else{
            println("Falha ao logar")
        }
    }
}