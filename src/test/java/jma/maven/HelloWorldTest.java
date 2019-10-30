package jma.maven;

import org.junit.jupiter.api.Test;

/**
 * JMA - 30/10/2019 22:11
 **/
public class HelloWorldTest {
    @Test
    public void testMethod(){
        System.out.println("I'm HERE !!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(System.getenv("TEST_HOST"));
    }
}
