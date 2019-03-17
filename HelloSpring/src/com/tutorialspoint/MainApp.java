package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

        // Inner Beans
        ApplicationContext context4 = new ClassPathXmlApplicationContext("Beans_InnerBean.xml");
        TextEditor te = (TextEditor) context4.getBean("textEditor");
        te.spellCheck();

        // Beans collection
        ApplicationContext context5 = new ClassPathXmlApplicationContext("Beans_Collection.xml");
        JavaCollection jc = (JavaCollection) context5.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();

        // Java config class
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();

        // Another
        ApplicationContext ctx1 =
                new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor te1 = ctx1.getBean(TextEditor.class);
        te1.spellCheck();

        // Another
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(ConfigB.class);

        // now both beans A and B will be available...
        A a = ctx2.getBean(A.class);
        B b = ctx2.getBean(B.class);
    }
}
