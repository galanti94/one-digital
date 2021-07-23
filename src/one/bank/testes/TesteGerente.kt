package one.bank.testes


import one.bank.Gerente
import one.bank.Funcionario
import java.math.BigDecimal

fun main(){
    val joao = Gerente(nome = "Gui", cpf = "124232", salario = 10000.0)
    imprimeRelatorio(joao)
}