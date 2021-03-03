class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: String){
        if(admin.autentica(senha)){
            println("Bem vindo ao bytebank")
        }else{
            println("Falha ao logar")
        }
    }
}