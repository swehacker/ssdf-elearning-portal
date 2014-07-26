package se.ssdf.elearning.common;

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
        byte[] bytesOfMessage = toBeEncrypted.getBytes("UTF-8");

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] thedigest = md.digest(bytesOfMessage);
        return new String(thedigest);
    }
}
