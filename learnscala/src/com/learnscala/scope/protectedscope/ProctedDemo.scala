package com.learnscala.scope.protectedscope

class SuperClass {
  protected def f()=println(".....")
}

class SubClass extends SuperClass{
  f()
}

class OtherClass{
  //下面这个语句会报错 其他类不能访问  protected修饰的变量或方法
  //f()
}