package se.ssdf.elearning.services.certificate;


import org.springframework.stereotype.Service;
import se.ssdf.elearning.ImageSrc;
import se.ssdf.elearning.certificate.Certificate;
import se.ssdf.elearning.certificate.CertificateId;
import se.ssdf.elearning.certificate.CertificateType;
import se.ssdf.elearning.services.CertificateService;
import se.ssdf.elearning.users.User;

import java.util.Date;
import java.util.List;

@Service(value = "CertificateService")
public class CertificateServiceMongoDB implements CertificateService {
    @Override
    public Certificate order(User student, User instructor, CertificateId certificateId, ImageSrc imageSrc) {
        return null;
    }

    @Override
    public Certificate beingProcessed(Certificate certificate, User administrator) {
        return null;
    }

    @Override
    public Certificate processed(Certificate certificate, User administrator) {
        return null;
    }

    @Override
    public Certificate delivered(Certificate certificate, User administrator) {
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
