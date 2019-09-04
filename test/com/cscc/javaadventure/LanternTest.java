//Last updated by Nick Napolitano on 9/4/2019
package com.cscc.javaadventure;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanternTest {
    private Lantern theLantern;

    @BeforeEach
    void setUp() {
        theLantern = new Lantern();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getWeight() {
        Double expected = 1.5;
        Double actual = this.theLantern.getWeight();
        assertEquals(expected, actual);
    }


    @Test
    void isLit() {
        boolean expected = false;
        boolean actual = this.theLantern.isLit();
        assertEquals(expected, actual);


    }

    @Test
    void setLit() {
        boolean expected = true;
        boolean actual;
        this.theLantern.setLit(expected);
        actual = this.theLantern.isLit();
        assertEquals(expected, actual);

    }

    @Test
    void isBroke() {
        boolean expected = false;
        boolean actual = this.theLantern.isBroke();
        assertEquals(expected, actual);
    }

    @Test
    void setBroke() {
        boolean expected = true;
        boolean actual;
        this.theLantern.setBroke(expected);
        actual = this.theLantern.isBroke();
        assertEquals(expected, actual);
    }

    @Test
    void getDescription() {
        String expected = "A tarnished, old lantern that has seen better days.";
        String actual = this.theLantern.getDescription();
        assertEquals(expected, actual);
    }


    @Test
    void swapLit() {
        boolean expected = true;
        boolean actual;
        this.theLantern.swapLit();
        actual = this.theLantern.swapLit();
        assertEquals(expected, actual);
    }

    @Test
    void swapBroke() {
        boolean expected = true;
        boolean actual;
        this.theLantern.swapBroke();
        actual = this.theLantern.swapBroke();
        assertEquals(expected, actual);
    }

    @Test
    void litDescription() {
        String expected = "A tarnished, old lantern that has seen better days. It is unlit.";
        String actual;
        this.theLantern.litDescription();
        actual = this.theLantern.litDescription();

        assertEquals(expected, actual);

    }
}