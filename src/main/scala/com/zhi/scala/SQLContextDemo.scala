package com.zhi.scala
import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

/**
  * 1.x版本中使用SQLContext
  */
object SQLContextDemo {
  def main(args: Array[String]): Unit = {

    val path = args(0)

    //1)創建相应的Context
    val sparkConf = new SparkConf()
    sparkConf.setAppName("SQLContextApp").setMaster("local[2]")

    val sc = new SparkContext(sparkConf)
    val sqlContext = new SQLContext(sc)

    //2)相关的处理,json
    val people = sqlContext.read.format("json").load(path)
    people.printSchema()
    people.show()


    //3)关闭资源
    sc.stop()

  }
}
