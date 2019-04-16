package com.icomac.spring.ioc;

import java.io.FileNotFoundException;

/**
 * Created by icomac on 19/4/10.
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws FileNotFoundException, Exception;

}
