package com.learnscala.scope
//������
//ͨ��HashMap=> _��������㱻����������
import java.util.{HashMap=> _,_}
import scala.collection.mutable.HashMap


object HideImport {
  def main(args: Array[String]): Unit = {

    //�����Ļ�,HashMap���������ָ��scala.collection.mutable.HashMap
    val scalaHashMap=new HashMap[String,String]
    scalaHashMap.put("Spark", "excellent")
    scalaHashMap.put("MapReduce", "good")
    scalaHashMap.foreach(e=>{
      val (k,v)=e
      println(k+":"+v)
    })
  }
} 