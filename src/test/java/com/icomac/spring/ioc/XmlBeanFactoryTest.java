package com.icomac.spring.ioc;

import com.icomac.spring.Car;
import com.icomac.spring.HelloService;
import com.icomac.spring.Wheel;
import com.icomac.spring.ioc.xml.XmlBeanFactory;

import org.junit.Test;

/**
 * Created by icomac on 19/4/10.
 */
public class XmlBeanFactoryTest {

    @Test
    public void getBean() throws Exception {
        System.out.println("--------- IOC test ----------");
        String location = getClass().getClassLoader().getResource("toy-spring.xml").getFile();
        XmlBeanFactory bf = new XmlBeanFactory(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);

        System.out.println("\n--------- AOP test ----------");
        HelloService helloService = (HelloService) bf.getBean("helloService");
        helloService.sayHelloWorld();
    }
}