package one.bank.testes


import one.bank.Gerente
import one.bank.Funcionario
import java.math.BigDecimal

fun main(){
    val joao = Gerente(nome = "João Marques", cpf = "428737232", salario = 10000.0, senha = "senha123")
    imprimeRelatorio(joao)

    TesteAutenticacao().autentica(joao)
}