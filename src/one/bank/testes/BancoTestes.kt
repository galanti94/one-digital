package one.bank.testes

import one.bank.Banco

fun main(){
    val oneBank = Banco(nome = "Onebank", numero = 12)

    println(oneBank.nome)
    println(oneBank.numero)

    val banco2 = oneBank.copy(nome = "Banco2", numero = 13) // Posso operar sobre a cópia do objeto

    println(banco2.nome)
    println(banco2.numero)
}