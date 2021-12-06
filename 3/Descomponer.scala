
object String {
  def main(args: Array[String]) {

    val frase = "Hola como estas"
    
    val ArrPalabras: Array[String] = frase.split(" ")
    ArrPalabras.foreach(println)
    println()
    val listaCar: List[Char] = frase.toList;
    listaCar.foreach(println)
  }
}