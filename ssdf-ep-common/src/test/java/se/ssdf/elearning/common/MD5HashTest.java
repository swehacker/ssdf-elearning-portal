package se.ssdf.elearning.common;

import junit.framework.TestCase;
import se.ssdf.elearning.utils.MD5Hash;

public class MD5HashTest extends TestCase {

    public void testThatTwoIdenticalHashIsTheSame() throws Exception {
        assertTrue(MD5Hash.hash("Password").equals(MD5Hash.hash("Password")));
    }

    public void testIfTwoAlmostIdenticalHashIsNotTheSame() throws Exception {
        assertFalse(MD5Hash.hash("password").equals(MD5Hash.hash("Password")));
    }
}