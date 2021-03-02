fun avaliaSaldo(saldo: Double) {
    /**
     * IF tradicional

    if(saldo < 0) {
    println("Saldo negativo: $saldo")
    }else if(saldo == 0.0){
    println("Saldo neutro: $saldo")
    }else{
    println("Saldo positivo: $saldo")
    }

     */
    /**
     * Estrutura WHEN (RECOMENDADA)
     */
    when {
        saldo < 0 -> println("Saldo negativo: $saldo")
        saldo == 0.0 -> println("Saldo neutro: $saldo")
        else -> println("Saldo positivo: $saldo")
    }

}