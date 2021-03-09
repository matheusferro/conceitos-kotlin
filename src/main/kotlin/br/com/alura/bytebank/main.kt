import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val testeFuncao: () -> Unit
    //let -> Utiliza generics
    //Objeto Endereco
    Endereco().let{
        it
    }

    //String
    "String qualquer".let{
        it
    }

    //Int
    177.let{
        it
    }

    //Por ter uma função como parâmetro, podemos utilizar direto.
    teste{ }
    //teste(1){}    quando temos dois parametros, utlimo sendo uma função
    //teste({},1)   quando temos dois parametros, primeiro sendo uma função
}


/**
 * High-Order Function -> Uma função que recebe/devolve outra...
 */

fun teste(bloco: () -> Unit){

}
