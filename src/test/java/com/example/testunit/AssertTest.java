package com.example.testunit;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AssertTest {
    @Test
    void inegaliteNombre(){
        assertNotEquals(5,4,"5 et 4 ne sont pas egaux");
    }

    @Test
    void inegaliteList(){
        List<String> l1= Arrays.asList("a","b","c");
        List<String> l2=Arrays.asList("b","c","a");
        assertNotEquals(l1,l2);
    }

    @Test
    void testTrue(){
        assertTrue(true);
    }
    @Test
    void egaliteObjet(){
        String a=new String("hello");
        String b=new String("hello");
        //c est le meme que b
        //String c=b;
        assertNotSame(a,b);
    }

    @Test
    void testGroupe(){
        Dimension rect=new Dimension(400,500);
        assertAll("Dimensions conformes",
                ()->{assertTrue(rect.getHeight()==500.00,"La hauteur est 500");},
                ()->{assertTrue(rect.getWidth()==400.00,"La hauteur est 400");
        });
    }

}