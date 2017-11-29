package com.learnscala.inherrit

class Person(name:String ,age:Int){
  println("Constructing Person")
  //������д
  def walk()=println("walk like a normal person")
}

class Student(name:String,age:Int,studentNo:String) extends Person(name,age){
   println("Constructing Student")
   override def walk():Unit={
       super.walk()//���ø����walk����
       println("walk like a elegant swan")//�������Լ���ʵ��
  }
}
object Demo {
  def main(args:Array[String]){
    //���
    //Constructing Person
     //Constructing Student
    val student=new Student("tom",12,"20189");
    student.walk();
  }
}