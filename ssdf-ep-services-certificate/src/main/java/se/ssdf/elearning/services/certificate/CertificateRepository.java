package se.ssdf.elearning.services.certificate;

import se.ssdf.elearning.certificate.Certificate;
import se.ssdf.elearning.certificate.Status;
import se.ssdf.elearning.exception.RepositoryException;

import java.sql.SQLException;

public interface CertificateRepository {
    /**
     * Init will set up the database, perform upgrading and other things needed before start servicing the app.
     *
     * @throws RepositoryException
     */
    void init() throws RepositoryException;

    /**
     * Store a new Certificate and its current status.
     *
     * @param certificate
     * @param status
     * @return
     * @throws RepositoryException
     */
    Certificate create(Certificate certificate, Status status) throws RepositoryException;
}
