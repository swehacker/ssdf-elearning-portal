package se.ssdf.elearning.services.certificate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.ssdf.elearning.Administrator;
import se.ssdf.elearning.ImageSrc;
import se.ssdf.elearning.Instructor;
import se.ssdf.elearning.Student;
import se.ssdf.elearning.certificate.Certificate;
import se.ssdf.elearning.certificate.CertificateId;
import se.ssdf.elearning.certificate.CertificateType;
import se.ssdf.elearning.services.CertificateService;

import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

@Service
public class CertificateServiceImpl implements CertificateService {

    @Autowired
    private CertificateRepository certificateRepository;


    @Override
    public Certificate order(Student student, Instructor instructor, CertificateId certificateId, ImageSrc imageSrc) {
        return null;
    }

    @Override
    public Certificate beingProcessed(Certificate certificate, Administrator administrator) {
        return null;
    }

    @Override
    public Certificate processed(Certificate certificate, Administrator administrator) {
        return null;
    }

    @Override
    public Certificate delivered(Certificate certificate, Administrator administrator) {
        return null;
    }

    @Override
    public Certificate find(CertificateId id) {
        return null;
    }

    @Override
    public List<Certificate> findBy(CertificateType type) {
        return null;
    }

    @Override
    public List<Certificate> findBy(Date from, Date to) {
        return null;
    }
}
