package com.learninjava;

import javax.jws.WebService;

/**
 * @author learninjava.com
 * @see www.learninjava.com
 */
@WebService(endpointInterface = "com.learninjava.HelloAngryWorld")
public class HelloAngryWorldImpl implements HelloAngryWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

