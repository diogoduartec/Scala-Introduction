object factorialdowhileeg {
  def main(arg: Array[String]){
    var factresult = 1
    var num = 5
    while(num > 0){
      factresult = factresult * num
      num = num - 1
    }
    println("Factorial(5) " + factresult)
  }
}
