package com.learnscala.classobject
//�ⲿ�಻�ܷ����ڲ���ĳ�Ա�򣬵��ڲ������ֱ�ӷ����ⲿ���Ա�����������Ա����private˽�е�

class OuterClass {
  //��ʹ����Ϊ private[this] var x:Int=0��Ҳ�ǿ��е�
  private var x:Int=20

  //def getInnerY=y���ⲿ�಻��ֱ�ӷ����ڲ���ĳ�Ա��
  class InnerClass{
    private var y:Int=0
    //�ڲ��������ֱ�ӷ����ⲿ��ĳ�Ա�����ͳ�Ա����,ע���ⲿ��ĳ�Ա������private
    def getOuterX= x
  }
}

object InnerClassDemo{
  def main(args: Array[String]): Unit = {
    val o=new OuterClass
    //�����ڲ������ͨ��o.InnerClass��ʽ��InnerClass������OuterClass�ĳ�Ա����һ��
    val i=new o.InnerClass
    println(i.getOuterX)
  }
}
