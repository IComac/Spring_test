package com.icomac.spring.aop;

/**
 * @author yihua.huang@dianping.com
 */
public interface PointcutAdvisor extends Advisor {

   Pointcut getPointcut();
}
