package one.bank

// Outerclass, classe de fora
class Pessoa {

    var nome: String = "Guilherme"
    var cpf: String = "123.456.789-10"

    private set // Não deixa alterar fora do escopo da classe

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
/*
    // Não dá para usar sempre o inner class
    // Usado somente em casos especiais, casos de parses
    inner class Endereco{
        var rua: String = "Rua teste"
        var numero: Int = 10
    }

 */
}

fun main(){
    val guilherme = Pessoa()

    println(guilherme.pessoaInfo())


    //println(guilherme.Endereco().rua)
}