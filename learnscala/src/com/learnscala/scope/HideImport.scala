package com.learnscala.scope
//类隐藏
//通过HashMap=> _，这样类便被隐藏起来了
import java.util.{HashMap=> _,_}
import scala.collection.mutable.HashMap


object HideImport {
  def main(args: Array[String]): Unit = {

    //这样的话,HashMap便无歧义地指向scala.collection.mutable.HashMap
    val scalaHashMap=new HashMap[String,String]
    scalaHashMap.put("Spark", "excellent")
    scalaHashMap.put("MapReduce", "good")
    scalaHashMap.foreach(e=>{
      val (k,v)=e
      println(k+":"+v)
    })
  }
} 