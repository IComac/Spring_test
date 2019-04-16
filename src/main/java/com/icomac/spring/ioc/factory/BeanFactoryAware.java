package com.icomac.spring.ioc.factory;

/**
 * Created by icomac on 19/4/10.
 */
public interface BeanFactoryAware {

    void setBeanFactory(BeanFactory beanFactory) throws Exception;
}
