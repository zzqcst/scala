case class Person(name:String,age:Int)
object HelloWorld {
  def upper(strings: String*)=strings.map(_.toUpperCase)
  def main(args: Array[String]): Unit = {
//    val hi=HelloWorld.upper("hello world","hello shenyang").mkString("[",",","]")
//    println(hi)
//    val person = Person.apply("xiaoming",19)
//    println(person)
    println(abc("abc"))
    val arr=new Array[String](5)
    arr(0)="a"
    arr(1)="b"
    arr.foreach(s=>println(s))
    println(fac(5))
  }
  def abc:PartialFunction[Any,String]={
    case "abc"=>
      "abc"
    case "bcd"=>
      "ncd"
    case _=>
      "wrong"
  }

  def fac(a:Int):Int={
    if(a<=1){
      1
    }else{
      a*fac(a-1)
    }
  }
}
