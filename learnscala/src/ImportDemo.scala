

//package com.learnscala.packageimport
//这里使用分层包定义，忽略掉目录位置

package cn {
  package scala {
    //在包cn.scala下创建了一个Utils单例
    object Utils {
      def toString(x: String) {
        println(x)
      }
      //外层包无法直接访问内层包，下面这一行代码编译通不过
      //def getTeacher():Teacher=new Teacher("john")
      //如果一定要使用的话，可以引入包
      import cn.scala.xtwy._
      def getTeacher(): Teacher = new Teacher("john")
    }
    
    //定义了cn.scala.xtwy
    package xtwy {
      class Teacher(var name: String) {
        //演示包的访问规则
        //内层包可以访问外层包中定义的类或对象，无需引入
        def printName() = { Utils.toString(name) }
      }

    }
  }
}

object ImportDemo  {
  def main(args:Array[String]){
   import cn.scala._
   import cn.scala.xtwy._
   Utils.toString("tomcat")
   new Teacher("jetty").printName() 
  }
  
}