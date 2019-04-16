package com.icomac.spring.aop;

import org.aopalliance.aop.Advice;

/**
 * Created by icomac on 19/4/10.
 */
public interface Advisor {

    Advice getAdvice();
}
