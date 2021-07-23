package one.bank

// um tipo abstrato só pode ser chamado por classes filhas
// é uma classe mãe
abstract class Pessoa (
    val nome: String,
    val cpf: String,
)