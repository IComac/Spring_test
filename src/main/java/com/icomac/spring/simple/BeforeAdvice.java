package com.icomac.spring.simple;

import java.lang.reflect.Method;

/**
 * Created by icomac on 19/4/10.
 */
public class BeforeAdvice implements Advice {

    private Object bean;

    private MethodInvocation methodInvocation;

    public BeforeAdvice(Object bean, MethodInvocation methodInvocation) {
        this.bean = bean;
        this.methodInvocation = methodInvocation;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        methodInvocation.invoke();
        return method.invoke(bean, args);
    }
}
