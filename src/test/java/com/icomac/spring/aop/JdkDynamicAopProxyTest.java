package com.icomac.spring.aop;

import com.icomac.spring.HelloService;
import com.icomac.spring.HelloServiceImpl;
import com.icomac.spring.aop.AdvisedSupport;
import com.icomac.spring.aop.JdkDynamicAopProxy;
import com.icomac.spring.aop.TargetSource;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * 对JdkDynamicAopProxy进行测试
 * Created by icomac on 19/4/10.
 */
public class JdkDynamicAopProxyTest {

    @Test
    public void getProxy() throws Exception {
        System.out.println("---------- no proxy ----------");	//无代理
        HelloService helloService = new HelloServiceImpl();		//目标对象实例化
        helloService.sayHelloWorld();

        System.out.println("\n----------- proxy -----------");	//启动代理
        AdvisedSupport advisedSupport = new AdvisedSupport();	//实例化advisedSupport（集合目标对象以及方法拦截器和匹配法则）
        advisedSupport.setMethodInterceptor(new LogInterceptor());	//添加方法拦截器，相当于织入执行通知
        //目标资源类（这集合了目标对象以及类和接口）实例化
        TargetSource targetSource = new TargetSource(
                helloService, HelloServiceImpl.class, HelloServiceImpl.class.getInterfaces());
        advisedSupport.setTargetSource(targetSource);	//添加目标对象
        advisedSupport.setMethodMatcher((Method method, Class beanClass) -> true);	//添加匹配法则
        //advisedSupport获得代理,并生成代理对象helloService
        helloService = (HelloService) new JdkDynamicAopProxy(advisedSupport).getProxy();
        helloService.sayHelloWorld();
    }
}