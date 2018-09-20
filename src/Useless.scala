case class Human(name: String, age: Int) {
  println("构造函数")
  override def toString: String = "name:" + name + ",age:" + age
}

object Useless {
  def main(args: Array[String]): Unit = {
    val p1 =Human("libai", 18)
    println(p1)
  }
}
