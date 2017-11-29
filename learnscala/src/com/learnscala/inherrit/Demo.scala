package com.learnscala.inherrit

class Person(name:String ,age:Int){
  println("Constructing Person")
  //方法重写
  def walk()=println("walk like a normal person")
}

class Student(name:String,age:Int,studentNo:String) extends Person(name,age){
   println("Constructing Student")
   override def walk():Unit={
       super.walk()//调用父类的walk方法
       println("walk like a elegant swan")//增加了自己的实现
  }
}
object Demo {
  def main(args:Array[String]){
    //输出
    //Constructing Person
     //Constructing Student
    val student=new Student("tom",12,"20189");
    student.walk();
  }
}