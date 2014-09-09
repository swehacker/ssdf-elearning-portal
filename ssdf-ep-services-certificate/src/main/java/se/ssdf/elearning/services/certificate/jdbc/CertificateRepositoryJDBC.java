package se.ssdf.elearning.services.certificate.jdbc;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.ssdf.elearning.certificate.Certificate;
import se.ssdf.elearning.certificate.Status;
import se.ssdf.elearning.exception.RepositoryException;
import se.ssdf.elearning.services.certificate.CertificateRepository;
import se.ssdf.elearning.utils.logging.Log4j;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@Service
public class CertificateRepositoryJDBC implements CertificateRepository {
    @Log4j
    private static Logger log;

    private DataSource dataSource;

    @Autowired
    public CertificateRepositoryJDBC(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void init() throws RepositoryException {
        log.debug("INIT DATABASE");

        try (Connection conn = dataSource.getConnection()) {
            Statement stmt = conn.createStatement();
            boolean status = stmt.execute(SQL.CERTIFICATE_DB_CREATE);
            log.debug("CREATE TABLE CERTIFICATE: " + (status ? "CREATED" : "ALREADY EXIST"));
            status = stmt.execute(SQL.CERTSTATUS_DB_CREATE);
            log.debug("CREATE TABLE CERTSTATUS: " + (status ? "CREATED" : "ALREADY EXIST"));
            status = stmt.execute(SQL.CERTTYPE_DB_CREATE);
            log.debug("CREATE TABLE CERTTYPE: " + (status ? "CREATED" : "ALREADY EXIST"));
        } catch (SQLException sqle) {
            throw new RepositoryException(sqle);
        }

        log.debug("INIT DATABASE DONE");
    }

    @Override
    public Certificate create(Certificate certificate, Status status) throws RepositoryException {
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(SQL.CERTIFICATE_INSERT);
        } catch (SQLException sqle) {
            throw new RepositoryException(sqle);
        }

        return null;
    }
}
