package com.ss;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class UserDaoProxy implements InvocationHandler {

  // 把创建的是谁的代理对象，把谁传递过来
  // 有参数构造
  private Object object;

  public UserDaoProxy(Object obj) {
    this.object = obj;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    // 方法之前处理
    System.out.println("方法之前执行" + method.getName() + "\t传递参数" + Arrays.toString(args));
    // 被增强的方法
    Object invoke = method.invoke(object,args);
    // 方法之后
    System.out.println("方法之后执行"+object);
    return invoke;
  }
}
