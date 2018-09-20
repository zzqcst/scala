object Test {
  def main(args: Array[String]): Unit = {
    val person = Person2()
    person.sayHi()
  }
}
trait Handler{
  def handle(data:String): Unit ={

  }
}
trait DataValidHandler extends Handler{
  override def handle(data: String): Unit = {
    println("DataValidHandler")
    super.handle(data)
  }
}
trait SignatureValidHandler extends Handler{
  override def handle(data: String): Unit = {
    println("SignatureValidHandler")
    super.handle(data)
  }
}
case class Person2() extends DataValidHandler with SignatureValidHandler{
  def sayHi(): Unit ={
    println("hello")
    handle("")
  }
}