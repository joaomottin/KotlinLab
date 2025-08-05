fun main (){
    val valor = 7
    if (parOuImpar(valor)) println("$valor é par!")
    else println ("$valor é impar!")
    // Segunda abordagem
    println(retornarParOuImpar(valor))
    println(exemploLambda())
    println(exemploListas())
    println(exemploMapas())
}

fun parOuImpar(valor: Int) : Boolean {
    return valor % 2 == 0
}

fun retornarParOuImpar (valor : Int) : String{
    if (valor % 2 == 0) return "$valor é par ;P"
    return "$valor é impar ;P"
}

fun exemploLambda() {
    val dobro: (Int) -> Int = { valor -> valor * 2 }
    val quadrado: (Int) -> Int = { it * it }
    val mensagem: () -> String = { "Boa noite :)" }
    val saudacao: (String) -> String = { "Boa noite, $it!" }
    val mediaFormatada: (Float) -> String = { String.format("$.2f", it) }
    val linguagem: () -> Unit = { println("to vendo Kotlin") }

    println("Dobro de 7 ${dobro(7)}")
    println("Quadrado de 4 ${quadrado(4)}")
    println("Mensagem: ${mensagem()}")
    println("Saudação: ${saudacao("João Mottin")}")
    println("Média 7.13287 formatada: ${mediaFormatada(7.13287F)}")

}
    fun exemploListas(){
        val nomes : List<String> = listOf("João", "Iago", "Davi")
        val frutas = mutableListOf ("Maçã", "Banana", "Kiwi")
        frutas.removeAt(0)
        frutas.add("Morango")
        println(nomes[1])
        println(frutas.size)
    }

fun exemploMapas(){


    val capitais = mapOf(
        "BR" to "Brasília",
        "PT" to "Lisboa",
        "JP" to "Tokyo"
    )

    val telefones = mutableMapOf("Iago" to "(41) 99248-2495")
    telefones["Zézinho"] = "(41) 99242-1394"
    telefones["Luizinho"] = "Sem número"

    println("\nAcessando mapa imutável: ")
    println("Capital do Brasil: ${capitais["BR"]}")
    println("Capital dos EUA: ${capitais.getOrDefault("EUA", "Não cadastrado")}")
    println("Capital da Argentina: ${capitais["AR"]}")
    println("Capital do Peru: ${capitais["PR"]}")

    println("\nAcessando mapa mutavel")
    telefones.forEach {println(it)}

    println("\nTelefone do Zézinho ${telefones.getOrDefault("Zézinho", "Tem nada carai")}")
    println("\nTelefone do Luiz ${telefones.getOrDefault("(41) 99429-3128", "Fudeu")}")
}