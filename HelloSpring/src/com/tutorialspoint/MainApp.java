package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
    public static void main(String[] args)
    {
        // Normal instantiation

        ApplicationContext context1 = new ClassPathXmlApplicationContext("Beans_first.xml");
        HelloWorld obj1 = (HelloWorld) context1.getBean("helloWorld");
        obj1.getMessage();

        ((AbstractApplicationContext) context1).registerShutdownHook();

        /*
         * ((AbstractApplicationContext) context1).registerShutdownHook();
         * Bean is going through init.
         * Your Message : Hello World!
         * Your Message : I'm object A
         * Your Message : I'm object A
         * Your Message : I'm object A
         * Your Message : null
         * Bean will destroy now.
         */

        /*
         * ((AbstractApplicationContext) context1).close();
         * Bean is going through init.
         * Your Message : Hello World!
         * Bean will destroy now.
         * Your Message : I'm object A
         * Your Message : I'm object A
         * Your Message : I'm object A
         * Your Message : null
         */

        // Singleton
        ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans_Singleton.xml");
        HelloWorld objA = (HelloWorld) context2.getBean("helloWorld");

        objA.setMessage("I'm object A");
        objA.getMessage();

        HelloWorld objB = (HelloWorld) context2.getBean("helloWorld");
        objB.getMessage();

        // Prototype
        ApplicationContext context3 = new ClassPathXmlApplicationContext("Beans_Prototype.xml");
        HelloWorld objA3 = (HelloWorld) context3.getBean("helloWorld");

        objA3.setMessage("I'm object A");
        objA3.getMessage();

        HelloWorld objB3 = (HelloWorld) context3.getBean("helloWorld");
        objB3.getMessage();
    }
}
