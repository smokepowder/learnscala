package com.learnscala.scope.protectedscope

class SuperClass {
  protected def f()=println(".....")
}

class SubClass extends SuperClass{
  f()
}

class OtherClass{
  //����������ᱨ�� �����಻�ܷ���  protected���εı����򷽷�
  //f()
}