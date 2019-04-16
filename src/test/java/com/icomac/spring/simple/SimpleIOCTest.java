package com.icomac.spring.simple;

import com.icomac.spring.Car;
import com.icomac.spring.Wheel;
import com.icomac.spring.simple.SimpleIOC;

import org.junit.Test;

/**
 * Created by icomac on 19/4/10.
 */
public class SimpleIOCTest {

    @Test
    public void getBean() throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("toy-spring-ioc.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}