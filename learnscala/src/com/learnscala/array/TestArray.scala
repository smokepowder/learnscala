package com.learnscala.array

import scala.collection.mutable.ArrayBuffer

object TestArray {
  def main(args:Array[String]){
    ////定义一个长度为10的数值数组
    val numberArray=new Array[Int](10);
    //定义一个长度为10的字符串数组
    val strArray=new Array[String](10)  
    strArray(0)="tomcat";
    println(strArray(0));
    //另一种定长数组定义方式
    //这种调用方式其实是调用其apply方法进行数组创建操作
    val strArray2=Array("First","Second")
    println(strArray2(1));
    
    ////创建String类型ArrayBuffer数组缓冲
    val strArrayVar=ArrayBuffer[String]()
    //+=意思是在尾部添加元素
    strArrayVar+="smoke";
    
    
  }
}