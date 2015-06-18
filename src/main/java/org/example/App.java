package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Test me some Spring!
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

    	HelloWorldService greeter = ctx.getBean(HelloWorldService.class);
        greeter.add("John", "Hopkins");
        greeter.add("Stella", "Artois");
        greeter.add("Michelle", "Guy");
        greeter.add("Stuart", "Little");
        greeter.add("Jeremiah", "Trotter");
        greeter.add("Por", "Cupine");
        greeter.add("Beverly", "Valleys");

        greeter.greet();
        greeter.greet();
        
        ctx.close();
    }
}
