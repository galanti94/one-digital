package one.bank.testes

import one.bank.Analista
import one.bank.Funcionario
import java.math.BigDecimal

fun main(){
    val joao = Analista(nome = "Gui", cpf = "124232", salario = 10000.0)
    imprimeRelatorio(joao)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())