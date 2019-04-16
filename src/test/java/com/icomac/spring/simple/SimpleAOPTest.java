package com.icomac.spring.simple;

import com.icomac.spring.HelloService;
import com.icomac.spring.HelloServiceImpl;
import com.icomac.spring.simple.Advice;
import com.icomac.spring.simple.BeforeAdvice;
import com.icomac.spring.simple.MethodInvocation;
import com.icomac.spring.simple.SimpleAOP;

import org.junit.Test;

/**
 * Created by icomac on 19/4/10.
 */
public class SimpleAOPTest {

    @Test
    public void getProxy() throws Exception {
        // 1. 创建一个 MethodInvocation 实现类
        MethodInvocation logTask = () -> System.out.println("log task start");
        HelloServiceImpl helloServiceImpl = new HelloServiceImpl();

        // 2. 创建一个 Advice
        Advice beforeAdvice = new BeforeAdvice(helloServiceImpl, logTask);

        // 3. 为目标对象生成代理
        HelloService helloServiceImplProxy = (HelloService) SimpleAOP.getProxy(helloServiceImpl,beforeAdvice);

        helloServiceImplProxy.sayHelloWorld();
    }
}