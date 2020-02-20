object functioneg {
  def main(arg: Array[String]){

    def add(a: Double = 100, b: Double = 200) : Double = {
      val sum = a + b
      return sum
    }
    println("SUM: "+ add(b=11))
  }
}
