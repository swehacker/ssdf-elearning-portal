package se.ssdf.elearning.domain;

import org.junit.Test;

public class PersonnummerTest {

    @Test
    public void testCreate() throws Exception {
        Personnummer.create("197208063912");
    }

    @Test
    public void testCreateIllegalArgument0() throws Exception {
        Personnummer.create("19720806-3912").formatString();
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCreateIllegalArgument1() throws Exception {
        Personnummer.create("abcde");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCreateIllegalArgument2() throws Exception {
        Personnummer.create("7208063912");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCreateIllegalArgument3() throws Exception {
        Personnummer.create("720806-3912");
    }

    @Test
    public void testIsValidAge() throws Exception {

    }

    @Test
    public void testIsValidAge1() throws Exception {

    }
}
