package com.example.testunit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

    Calculatrice ca;

    @BeforeEach
    void setup(){
        this.ca=new Calculatrice();
    }
    @Test
    @DisplayName(("Tester l'addition"))
    void testadditionner() {
        assertEquals(15,ca.additionner(10,5));
    }

    @Test
    @DisplayName("Tester la multiplication")
    void multiplier() {
        assertEquals(15,ca.multiplier(3,5));
    }
}