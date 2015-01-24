package se.ssdf.elearning.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5Hash is used to encrypt passwords so they are not readable (and therefor protected)
 *
 * <code>
 *     String encryptedString = MD5Hash.hash("StringToBeEncrypted");
 * </code>
 */
public class MD5Hash {
    public static String hash(String toBeEncrypted) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] thedigest = md.digest(toBeEncrypted.getBytes("UTF-8"));
        return new String(thedigest, "UTF-8");
    }
}
