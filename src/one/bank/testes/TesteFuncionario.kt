package one.bank.testes

import one.bank.Funcionario
import one.bank.Pessoa
import java.math.BigDecimal

fun main(){
    val guilherme = Pessoa(nome = "Guilherme", cpf = "124232")

    println(guilherme.nome)
    println(guilherme.cpf)

    val joao = Funcionario(nome = "Gui", cpf = "124232", salario = BigDecimal(10000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

}