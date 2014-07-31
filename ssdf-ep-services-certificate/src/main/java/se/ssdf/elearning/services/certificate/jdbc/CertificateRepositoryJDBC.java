package se.ssdf.elearning.services.certificate.jdbc;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.ssdf.elearning.certificate.Certificate;
import se.ssdf.elearning.certificate.Status;
import se.ssdf.elearning.services.certificate.CertificateRepository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Log4j
@Service
public class CertificateRepositoryJDBC implements CertificateRepository {
    private DataSource dataSource;

    @Autowired
    public CertificateRepositoryJDBC(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Certificate create(Certificate certificate, Status status) throws SQLException {
        Connection conn = dataSource.getConnection();
        conn.prepareStatement("SELECT 1;");
        return null;
    }
}
