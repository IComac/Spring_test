package com.icomac.spring;

/**
 * Created by icomac on 19/4/10.
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHelloWorld() {
        System.out.println("hello world!");
    }
}
