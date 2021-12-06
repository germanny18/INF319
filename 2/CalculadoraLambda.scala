

object CalculadoraLambda {

  def main(args: Array[String]) {
    
    println(suma(10, 2))
    println(resta(10,2))
    println(multi(10,2))
    println(division(10,2))

  }

  var suma = (x: Int, y: Int) => x + y
  var resta = (x: Int, y: Int) => x - y
  var multi = (x: Int, y: Int) => x * y
  var division = (x: Int, y: Int) => x / y
}