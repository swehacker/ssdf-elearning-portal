package se.ssdf.elearning.services.certificate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.ssdf.elearning.certificate.Certificate;
import se.ssdf.elearning.services.certificate.CertificateRepository;
import se.ssdf.elearning.certificate.Status;
import se.ssdf.elearning.utils.profiles.Acceptance;
import se.ssdf.elearning.utils.profiles.Prod;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component
@Prod @Acceptance
public class CertificateRepositoryJDBC implements CertificateRepository {
    private DataSource dataSource;

    @Autowired
    public CertificateRepositoryJDBC(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Certificate create(Certificate certificate, Status status) throws SQLException {
        Connection conn = dataSource.getConnection();
        return null;
    }
}
