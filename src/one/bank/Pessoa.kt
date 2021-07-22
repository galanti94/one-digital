package one.bank

class Pessoa {
    var nome: String = "Guilherme"
    var cpf: String = "123.456.789-10"
}

fun main(){
    val guilherme = Pessoa()

    println(guilherme.nome)
    println(guilherme.cpf)
}