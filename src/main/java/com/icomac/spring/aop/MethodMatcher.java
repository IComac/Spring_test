package com.icomac.spring.aop;

import java.lang.reflect.Method;

/**
 * Created by icomac on 19/4/10.
 */
public interface MethodMatcher {

    Boolean matchers(Method method, Class beanClass);
}
