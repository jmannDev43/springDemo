package org.mann.josh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args){
//        Triangle triangle = new Triangle();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Triangle triangle = (Triangle)context.getBean("triangle");
        triangle.draw();
    }
}
