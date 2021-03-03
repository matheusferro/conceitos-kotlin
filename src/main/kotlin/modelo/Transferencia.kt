package modelo

import modelo.Conta

interface Transferencia {
    fun transfere(valor: Double, destino: Conta): Boolean
}
