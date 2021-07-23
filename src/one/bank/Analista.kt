package one.bank

import java.math.BigDecimal

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio() = 0.1 * salario
}