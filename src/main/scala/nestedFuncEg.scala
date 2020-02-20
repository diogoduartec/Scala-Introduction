object nestedFuncEg {
  def main(arg: Array[String]): Unit ={
    def square(x: Double) : Double = {
      return x*x
    }

    def sumsquare(x: Double, y: Double) : Double = {
      return square(x) + square(y)
    }

    println("Sum of squares 2 and 3: " + sumsquare(2,3))

  }
}
