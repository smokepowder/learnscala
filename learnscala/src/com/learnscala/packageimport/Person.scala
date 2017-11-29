package com.learnscala.packageimport

abstract class Animal {
  //抽象字段(域）
  var height:Int
  //抽象方法
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