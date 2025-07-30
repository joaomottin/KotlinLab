fun main () {

    fun calculoMedia(){
    println("Informe a primeira nota: ")
    var n1 = readln().toFloat()

    println("Informe a primeira nota: ")
    var n2 = readln().toFloat()

    println("Informe a primeira nota: ")
    var n3 = readln().toFloat()

    val media = (n1 + n2 + n3) / 3

    println("Média $media")
    //println("Média %.2f".format(media))

    if (media >= 7) println("Aprovado!")
    else println("Reprovado.")
    }

    fun parOuImpar(valor: Int) : Boolean{
        return valor % 2 == 0
    }

    fun imparOuPar(){

    }


    }