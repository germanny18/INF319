

object Calculadora {

  def main(args: Array[String]) {

    println(suma(8, 2))
    println(resta(8, 2))
    println(multi(8, 2))
    println(division(8, 2))
  }

  def suma(x: Int, y: Int): Int = x + y
  def resta(x: Int, y: Int): Int = x - y
  def multi(x: Int, y: Int): Int = x * y
  def division(x: Int, y: Int): Int = x/y
 

}