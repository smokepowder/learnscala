package com.learnscala.array

import scala.collection.mutable.ArrayBuffer

object TestArray {
  def main(args:Array[String]){
    ////����һ������Ϊ10����ֵ����
    val numberArray=new Array[Int](10);
    //����һ������Ϊ10���ַ�������
    val strArray=new Array[String](10)  
    strArray(0)="tomcat";
    println(strArray(0));
    //��һ�ֶ������鶨�巽ʽ
    //���ֵ��÷�ʽ��ʵ�ǵ�����apply�����������鴴������
    val strArray2=Array("First","Second")
    println(strArray2(1));
    
    ////����String����ArrayBuffer���黺��
    val strArrayVar=ArrayBuffer[String]()
    //+=��˼����β�����Ԫ��
    strArrayVar+="smoke";
    
    
  }
}