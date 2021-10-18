package com.example.testunit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class HelloTest {

    Hello hello;
    @BeforeEach
    void setUp(){
        this.hello=new Hello();
    }
    @Test
    void sayhello() {
        assertEquals("Hello!",hello.sayhello());
    }
}