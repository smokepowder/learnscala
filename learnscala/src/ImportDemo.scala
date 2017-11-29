

//package com.learnscala.packageimport
//����ʹ�÷ֲ�����壬���Ե�Ŀ¼λ��

package cn {
  package scala {
    //�ڰ�cn.scala�´�����һ��Utils����
    object Utils {
      def toString(x: String) {
        println(x)
      }
      //�����޷�ֱ�ӷ����ڲ����������һ�д������ͨ����
      //def getTeacher():Teacher=new Teacher("john")
      //���һ��Ҫʹ�õĻ������������
      import cn.scala.xtwy._
      def getTeacher(): Teacher = new Teacher("john")
    }
    
    //������cn.scala.xtwy
    package xtwy {
      class Teacher(var name: String) {
        //��ʾ���ķ��ʹ���
        //�ڲ�����Է��������ж������������������
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