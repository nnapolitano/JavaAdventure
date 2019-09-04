//Last updated by Nick Napolitano on 9/4/2019
package com.cscc.javaadventure;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreasureChestTest {
    private TreasureChest theTreasureChest;

    @BeforeEach
    void setUp() {
        theTreasureChest = new TreasureChest();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getWeight() {
        double expected = 10;
        double actual = this.theTreasureChest.getWeight();
        assertEquals(expected, actual);
    }


    @Test
    void isOpen() {
        boolean expected = false;
        boolean actual = this.theTreasureChest.isOpen();
        assertEquals(expected, actual);

    }

    @Test
    void setOpen() {
        boolean expected = true;
        boolean actual;
        this.theTreasureChest.setOpen(expected);
        actual = this.theTreasureChest.isOpen();
        assertEquals(expected, actual);

    }

    @Test
    void isLocked() {
        boolean expected = true;
        boolean actual = this.theTreasureChest.isLocked();
        assertEquals(expected, actual);
    }

    @Test
    void setLocked() {
        boolean expected = false;
        boolean actual;
        this.theTreasureChest.setLocked(expected);
        actual = this.theTreasureChest.isLocked();
        assertEquals(expected, actual);

    }

    @Test
    void getDescription() {
        String expected = "A sturdy iron chest.";
        String actual = this.theTreasureChest.getDescription();
        assertEquals(expected, actual);
    }


    @Test
    void swapLocked() {
        boolean expected = false;
        boolean actual;
        this.theTreasureChest.swapLocked();
        actual = this.theTreasureChest.swapLocked();
        assertEquals(expected, actual);
    }

    @Test
    void swapOpen() {
        boolean expected = false;
        boolean actual;
        this.theTreasureChest.swapOpen();
        actual = this.theTreasureChest.swapOpen();
        assertEquals(expected, actual);
    }

    @Test
    void lockedDescription() {
        String expected = "A sturdy iron chest. It is locked.";
        String actual;
        this.theTreasureChest.lockedDescription();
        actual = this.theTreasureChest.lockedDescription();

        assertEquals(expected, actual);

    }
}