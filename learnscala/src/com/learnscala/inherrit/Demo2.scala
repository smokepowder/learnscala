package com.learnscala.inherrit
//�����Animal��
abstract class Animal(name:String,age:Int){
  def eat():Unit
}

//Student�̳г���Person��
class Dog(name:String,age:Int,var sNo:String) extends Animal(name,age){
  //��д�������е�walk���������Բ���override�ؼ���
  def eat():Unit={
    println("dog eat ")
  }
}
object Demo2 {
   def main(args: Array[String]): Unit = {
     val s=new Dog("mike",18,"102400")
     s.eat()
     //�����࣬ʵ�ֳ������eat����
     val s2=new Animal("tom",2){
       override def eat()={
         println("cat eat")
       }
     }
     
     s2.eat();
  }
}