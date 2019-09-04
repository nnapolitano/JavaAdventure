//Last updated by Nick Napolitano on 9/4/2019
package com.cscc.javaadventure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    private Character theCharacter;

    // The setUp method is run before every test is executed so that
    // a fresh character object is instantiated for every test.
    @BeforeEach
    void setUp() {
        theCharacter = new Character();
    }

    // Declare a string name that we expect.
    // Verify the string we expect matches the default name
    @Test
    void getName() {
        String expected = "Nameless Adventurer";
        String actual = this.theCharacter.getName();

        assertEquals(expected, actual);
    }

    // Try to set the character name to a new string.
    // Verify that the name has actually been changed.
    @Test
    void setName() {
        String expected = "Alfonso";
        String actual;
        this.theCharacter.setName(expected);
        actual = this.theCharacter.getName();

        assertEquals(expected, actual);
    }

    // Declare an Integer value we expect.
    // Verify that value we expect matches the default health value
    @Test
    void getHealth() {
        Integer expected = 10;
        Integer actual;
        actual = this.theCharacter.getHealth();

        assertEquals(expected, actual);
    }

    // Try to set the health to a new value.
    // Verify that the health has actually been changed.
    @Test
    void setHealth() {
        Integer expected = 15;
        Integer actual;
        this.theCharacter.setHealth(expected);
        actual = this.theCharacter.getHealth();

        assertEquals(expected, actual);
    }

    // Validate that the description is, by default, an empty string
    @Test
    void getDescription() {
        Integer expected = 0;
        Integer actual = this.theCharacter.getDescription().length();

        assertEquals(expected, actual);
    }

    // Verify that the keys and values of the character attribute HashMap
    // are what we expect
    @Test
    void getAttributes() {

        // Create an ArrayList of the attribute names that
        // we expect to find as keys in character class attributes HashMap
        ArrayList<String> attributeNames = new ArrayList<String>();
        attributeNames.add("Strength");
        attributeNames.add("Constitution");
        attributeNames.add("Intelligence");
        attributeNames.add("Wisdom");
        attributeNames.add("Dexterity");
        attributeNames.add("Charisma");

        // Verify that the size of the character attributes HashMap is
        // what we expect. This ensures that no extraneous keys have been created.
        Integer expectedSize = attributeNames.size();
        Integer actualSize= this.theCharacter.getAttributes().size();

        assertEquals(expectedSize, actualSize);

        // Verify that all the attribute names in our ArrayList can be found
        // in the character class attributes HashMap.
        for (String attributeName : attributeNames) {
            assertTrue(this.theCharacter.getAttributes().containsKey(attributeName));
        }

        // Verify that the value of every entry in the character attribute
        // HashMap is the expected default
        Integer expectedAttributeValue = 10;

        for (String key : theCharacter.getAttributes().keySet()) {
            Integer actualAttributeValue = theCharacter.getAttributes().get(key);
            assertEquals(expectedAttributeValue, actualAttributeValue);
        }
    }

    // Create a new HashMap of Attributes (or modify the value of the existing one)
    // and verify that the map has been altered.
    @Test
    void setAttributes() {
        HashMap<String, Integer> newAttributes = new HashMap<String, Integer>();;
        HashMap<String, Integer> oldAttributes = theCharacter.getAttributes();

        // Set the attributes to an empty HashMap
        theCharacter.setAttributes(newAttributes);

        // Verify that the objects are different
        assertNotSame(theCharacter.getAttributes(), oldAttributes);

        // Verify that the old attributes map has a different size from the new one
        assertNotEquals(theCharacter.getAttributes().size(), oldAttributes.size());
    }
}