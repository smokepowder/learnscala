package com.learnscala.packageimport

abstract class Animal {
  //�����ֶ�(��
  var height:Int
  //���󷽷�
  def eat:Unit
}

class Person(var height:Int) extends Animal{
  override def eat()={
    println("eat by mouth")
  }

}

object Person extends App{
  new Person(10).eat()
}