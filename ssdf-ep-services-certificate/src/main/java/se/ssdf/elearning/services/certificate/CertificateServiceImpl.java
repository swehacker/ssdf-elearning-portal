package se.ssdf.elearning.services.certificate;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.ssdf.elearning.Administrator;
import se.ssdf.elearning.ImageSrc;
import se.ssdf.elearning.Instructor;
import se.ssdf.elearning.Student;
import se.ssdf.elearning.certificate.Certificate;
import se.ssdf.elearning.certificate.CertificateId;
import se.ssdf.elearning.certificate.CertificateType;
import se.ssdf.elearning.exception.RepositoryException;
import se.ssdf.elearning.services.CertificateService;

import java.util.Date;
import java.util.List;

@Service(value = "CertificateService")
public class CertificateServiceImpl implements CertificateService {
    private static final Logger log = Logger.getLogger(CertificateService.class);

    private CertificateRepository certificateRepository;

    @Autowired
    public CertificateServiceImpl(CertificateRepository certificateRepository) {
        this.certificateRepository = certificateRepository;

        try {
            certificateRepository.init();
        } catch (RepositoryException re) {
            log.fatal(re);
        }
    }

    @Override
    public Certificate order(Student student, Instructor instructor, CertificateId certificateId, ImageSrc imageSrc) {
        try {
            certificateRepository.create(null, null);
        } catch (RepositoryException rpe) {
            log.error(rpe);
        }
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
