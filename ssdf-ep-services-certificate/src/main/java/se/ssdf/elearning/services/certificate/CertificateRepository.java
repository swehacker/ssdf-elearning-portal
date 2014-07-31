package se.ssdf.elearning.services.certificate;

import se.ssdf.elearning.certificate.Certificate;
import se.ssdf.elearning.certificate.Status;

import java.sql.SQLException;

public interface CertificateRepository {
    Certificate create(Certificate certificate, Status status) throws SQLException;
}
