package br.com.alura.bytebank.paradigmaFuncional

import br.com.alura.bytebank.modelo.Endereco


fun scopeFunctions() {
    val testeFuncao: () -> Unit
    //let -> Utiliza generics
    //Objeto Endereco
    //val endereco: Endereco = Endereco(logradouro = "Rua do meio", numero = "465")
    //val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    //println(enderecoEmMaiusculo)

    val enderecoEmMaiusculo = Endereco(logradouro = "Rua do meio", numero = "465")
        /**
         * Aqui em funções de escopo temos: let, also (Utiliza it), apply, run,  with, apply (Utiliza o this)
         * https://kotlinlang.org/docs/scope-functions.html#function-selection
         *
         * Utilizando apply com this
         */
        //.apply { "${logradouro}, ${numero}".toUpperCase() }
        //Utilizando let com it
        .let { "${it.logradouro}, ${it.numero}".toUpperCase() }
        /**
         * Não foi retornado o valor esperado (caixa alta)
         * pois aplly e also retorna o objeto de contexto
         * e let, run e with retorna o resultado lambda
         *
         * let  ->  opera com o resultado de uma ou mais funções e valores nullos.
         *      ->  cria variavel com escopo mais limitado com alguma modificação. (Retorno: Lambda)
         *
         * with ->  Receptor; Não é uma extensão; chama os membros do objeto de contexto diretamente;
         *      ->  "Com esse objeto faça"  (Retorno: Lambda)
         *
         * run  ->  Receptor; Retorna a computação do objeto (Retorno: Lambda)
         * run  ->  Sem extenção: similar ao with, sem receber objeto; Executa e retorna sua computação (Retorno: Lambda)
         *
         * apply->  Receptor; Recebe e retorna objeto de contexto; (Retorno: Objeto de contexto)
         *      ->  Applicar configurações no objeto
         *
         * also ->  Realiza ações a mais que não modifica o objeto. (Retorno: Objeto de contexto)
         *
         * https://kotlinlang.org/docs/scope-functions.html#context-object-this-or-it
         */

        .let { enderecoEmMaiusculo ->
            println(enderecoEmMaiusculo)
        }
    listOf(
        Endereco(complemento = "Bloco 07"),
        Endereco(),
        Endereco(complemento = "Casa")
    ).filter { endereco -> endereco.complemento.isNotEmpty() }
        .let(::println)
}