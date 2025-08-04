fun main (){
    val valor = 7
    if (parOuImpar(valor)) println("$valor é par!")
    else println ("$valor é impar!")

}

fun parOuImpar(valor: Int) : Boolean {
    return valor % 2 == 0
}