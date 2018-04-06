package com.zhi.scala

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.hive.HiveContext

/**
  * HiveContext
  */
object HiveContextDemo {
  def main(args: Array[String]): Unit = {
    val path = args(0)

    //1)創建相应的Context
    val sparkConf = new SparkConf()
    sparkConf.setAppName("HiveContextDemo").setMaster("local[2]")

    val sc = new SparkContext(sparkConf)
    val hiveContext = new HiveContext(sc)

    //2)相关的处理,json
    val people = hiveContext.read.format("json").load(path)
    people.printSchema()
    people.show()


    //3)关闭资源
    sc.stop()
  }
}
