package com.sshirgaleev.didemo.controllers;

import com.sshirgaleev.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static com.sshirgaleev.didemo.services.GreetingServiceImpl.HELLO_GURUS;
import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception{
        this.constructorInjectedController= new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(HELLO_GURUS, constructorInjectedController.sayHello());
    }

}
