package org.example;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test
	public void testApp()
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
