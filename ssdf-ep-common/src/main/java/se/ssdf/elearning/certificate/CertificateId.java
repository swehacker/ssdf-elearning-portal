package se.ssdf.elearning.certificate;

/**
 * Represents the identification of the certificate level a diver has.
 *
 * Scuba: SWE/F00/M3/00/000000 (old M2S 000)
 * Freediving: F3S 000-00 or AFI 4-6P 000-00
 */
public interface CertificateId {
    String getId();
}
