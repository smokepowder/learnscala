package com.learnscala.inherrit
//��̬������
//����Person1��
abstract class AbstractPerson(var name:String,var age:Int){

  def walk():Unit
  //talkTo����������ΪAbstractPerson����
  def talkTo(p:AbstractPerson):Unit
}


class StudentA(name:String,age:Int) extends AbstractPerson(name,age){
  private var studentNo:Int=0
  def walk()=println("walk like a elegant swan")
  //��д�����talkTo����
  def talkTo(p:AbstractPerson)={
    println("talkTo() method in Student")
    println(this.name+" is talking to "+p.name)
  }
}

class Teacher(name:String,age:Int) extends AbstractPerson(name,age){
  private var teacherNo:Int=0

  def walk()=println("walk like a elegant swan")

   //��д�����talkTo����
  def talkTo(p:AbstractPerson)={
    println("talkTo() method in Teacher")
    println(this.name+" is talking to "+p.name)
  }
}

object PolymorphicDemo {
  def main(args: Array[String]): Unit = {

     //��������д�����ʾ�˶�̬��ʹ��
     //Person������ÿ���ָ��Person����κ�����
     val p1:AbstractPerson =new Teacher("albert",38)
     val p2:AbstractPerson=new StudentA("john",38)

     //��������д�����ʾ�˶�̬��
     //talkTo������������ΪPerson����
     //p1.talkTo(p2)�����ʵ��������Student
     //p2.talkTo(p1)�����ʵ��������Teacher
     //��������ʵ�����͵��ö�Ӧ�Ĳ�ͬ�����е�talkTo()����
     p1.talkTo(p2)
     p2.talkTo(p1)
  }
}