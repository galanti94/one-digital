package one.bank.testes

import one.bank.ClienteTipo

fun main(){

    ClienteTipo.values().forEach { elemento -> // Posso usar apenas o it, nesse caso
        println("${elemento.name} ${elemento.descricao}")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.descricao}")
}