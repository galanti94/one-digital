package one.bank

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa (nome, cpf) {
    // protected somente as classes relacionadas têm acesso
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salário: $salario
        Valor do Auxílio: ${calculoAuxilio()}
    """.trimIndent()

}