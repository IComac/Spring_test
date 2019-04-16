package com.icomac.spring.ioc.factory;

/**
 * Created by icomac on 19/4/10.
 */
public interface BeanFactory {
    Object getBean(String beanId) throws Exception;
}
