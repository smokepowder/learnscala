package com.learnscala.scope
//private[this]���޶�ֻ�и���Ķ�����ܷ��ʣ������ֳ�ԱΪ����˽�г�Ա
class Teacher(var name: String) {
  private[this] def printName(tName:String="") :Unit= { println(tName) }
  //����private[this] printName����
  def print(n:String)=this.printName(n)
}

object Teacher{
   //private[this]�޶��ĳ�Ա����ʹ��������TeacherҲ����ʹ��
  //def printName=new Teacher("john").printName()
}

object LimitScopeDemo2 {
  def main(args: Array[String]): Unit = {
          //���벻��ͨ��
         //new Teacher("john").printName()
  }

}
