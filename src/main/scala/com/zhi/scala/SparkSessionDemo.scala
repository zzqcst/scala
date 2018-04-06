package com.zhi.scala

import org.apache.spark.sql.SparkSession

object SparkSessionDemo {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("SparkSessionDemo")
      .master("local[2]")
      .getOrCreate()

    val people = spark.read.json("/home/hadoop/projects/Ideaprojects/SparkScala/src/main/resource/people.json")

    people.show()

    spark.stop()
  }
}
