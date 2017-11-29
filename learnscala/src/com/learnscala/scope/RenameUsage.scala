package com.learnscala.scope
//将java.util.HashMap重命名为JavaHashMap
import java.util.{ HashMap => JavaHashMap }
import scala.collection.mutable.HashMap
object RenameUsage {
  def main(args: Array[String]): Unit = {
    val javaHashMap = new JavaHashMap[String, String]()
    javaHashMap.put("Spark", "excellent")
    javaHashMap.put("MapReduce", "good")
    for(key <- javaHashMap.keySet().toArray){
      println(key+":"+javaHashMap.get(key))
    }

    val scalaHashMap=new HashMap[String,String]
    scalaHashMap.put("Spark", "excellent")
    scalaHashMap.put("MapReduce", "good")
    scalaHashMap.foreach(e=>{
      val (k,v)=e
      println(k+":"+v)
    })
  }

}