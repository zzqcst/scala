// 私有构造方法
class Marker private(val color:String) {

  println("创建" + this)

  override def toString(): String = "颜色标记："+ color

}

// 伴生对象，与类共享名字，可以访问类的私有属性和方法
object Marker{

  private val markers: Map[String, Marker] = Map(
    "red" -> new Marker("red"),//创建颜色标记：red
    "blue" -> new Marker("blue"),//创建颜色标记：blue
    "green" -> new Marker("green")//创建颜色标记：green
  )

  def apply(color:String) = {
    if(markers.contains(color)) markers(color) else null //颜色标记：red
  }


  def getMarker(color:String) = {
    if(markers.contains(color)) markers(color) else null//颜色标记：blue
  }
  def main(args: Array[String]) {
    println(Marker("red"))
    // 单例函数调用，省略了.(点)符号
    println(Marker getMarker "blue")
  }
}