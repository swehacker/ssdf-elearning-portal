package se.ssdf.elearning.utils;

import junit.framework.TestCase;

public class MD5HashTest extends TestCase {

    public void testThatTwoIdenticalHashIsTheSame() throws Exception {
        assertTrue(MD5Hash.hash("Password").equals(MD5Hash.hash("Password")));
    }

    public void testIfTwoAlmostIdenticalHashIsNotTheSame() throws Exception {
        assertFalse(MD5Hash.hash("password").equals(MD5Hash.hash("Password")));
    }
}