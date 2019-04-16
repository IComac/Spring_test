package com.icomac.spring.simple;

import java.lang.reflect.Proxy;

/**
 * Created by icomac on 19/4/10.
 */
public class SimpleAOP {

    public static Object getProxy(Object bean, Advice advice) {
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(), bean.getClass().getInterfaces(), advice);
    }
}