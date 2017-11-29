package com.learnscala.inherrit
//抽象的Animal类
abstract class Animal(name:String,age:Int){
  def eat():Unit
}

//Student继承抽象Person类
class Dog(name:String,age:Int,var sNo:String) extends Animal(name,age){
  //重写抽象类中的walk方法，可以不加override关键字
  def eat():Unit={
    println("dog eat ")
  }
}
object Demo2 {
   def main(args: Array[String]): Unit = {
     val s=new Dog("mike",18,"102400")
     s.eat()
     //匿名类，实现抽象类的eat方法
     val s2=new Animal("tom",2){
       override def eat()={
         println("cat eat")
       }
     }
     
     s2.eat();
  }
}