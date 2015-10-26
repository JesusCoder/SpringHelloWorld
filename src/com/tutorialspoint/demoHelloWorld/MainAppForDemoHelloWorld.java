package com.tutorialspoint.demoHelloWorld;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.demoCommon.Gospel1;
import com.tutorialspoint.demoCommon.HelloChina;
import com.tutorialspoint.demoCommon.HelloWorld;

public class MainAppForDemoHelloWorld {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "com/tutorialspoint/demoHelloWorld/beansForDemoHelloWorld.xml");

        HelloWorld obj0 = (HelloWorld) context.getBean("helloWorld");
        HelloChina obj3 = (HelloChina) context.getBean("helloChina");
        Gospel1 obj1 = (Gospel1) context.getBean("gospel1");

        obj0.getMessage();
        obj3.setMessage("This is setting message through Lombok annotation \"Getter\" in my own Eclipse and my own test project, cool!");
        obj3.getMessage();
        System.out.println("obj1.getReflection() is: " + obj1.getReflection());
        System.out.println("obj3.getMessage() is: " + obj3.getMessage());
        System.out.println("obj2 is getting called!");
        context.registerShutdownHook();

        System.out.println("That's the end of the program!");
    }
}
