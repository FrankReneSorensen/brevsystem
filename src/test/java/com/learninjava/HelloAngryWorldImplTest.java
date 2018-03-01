package com.learninjava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author learninjava.com
 * @see www.learninjava.com
 */
public class HelloAngryWorldImplTest {

    @Test
    public void testSayHi() {
        HelloAngryWorldImpl helloAngryWorldImpl = new HelloAngryWorldImpl();
        String response = helloAngryWorldImpl.sayHi("Angry World");
        System.out.println("Response from web service is : " + response);
        assertEquals("HelloAngryWorldImpl not properly saying hi", "Hello Angry World", response);
    }
}
