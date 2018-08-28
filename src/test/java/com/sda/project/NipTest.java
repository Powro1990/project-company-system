package com.sda.project;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NipTest {

    private Nip nip;


 /*   @Before
    public void initialize() {
        Nip nip = new Nip ("1234563218");
    }
*/
    @Test(expected = InvalidNipNumber.class)
    public void nipLengthToShort() {
        new Nip("123456789");
    }

    @Test(expected = InvalidNipNumber.class)
    public void nipLengthToLong() {
        new Nip("12345678901");
    }

    @Test(expected = InvalidNipNumber.class)
    public void nipDoNotContainsOnlyLetters() {
        new Nip("123456789a");
    }

    @Test
    public void testIsNipCorrect() {
        Nip nip = new Nip("123 456 32 18");
        assertEquals("123-456-32-18", nip.getNip());
    }

}