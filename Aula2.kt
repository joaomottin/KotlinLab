fun main() {
    contagemRegressiva()
    // calculoMedia()
    // println(parOuImpar(4))
}

fun calculoMedia() {
    println("Informe a primeira nota: ")
    val n1 = readln().toFloat()

    println("Informe a segunda nota: ")
    val n2 = readln().toFloat()

    println("Informe a terceira nota: ")
    val n3 = readln().toFloat()

    val media = (n1 + n2 + n3) / 3
    println("Média: %.2f".format(media))

    if (media >= 7) println("Aprovado!")
    else println("Reprovado.")
}

//fun parOuImpar(valor: Int): Boolean {
//    return valor % 2 == 0
//}

fun contagemRegressiva() {
    for (i in 10 downTo 1) {
        println(i)
    }
}
