object classEg {
  def main(arg: Array[String]): Unit ={
    var ob = new NewClass("Hello World")
    ob.sayHi()
  }
}

class NewClass(mssg: String){
  def sayHi() = println(mssg)
}
