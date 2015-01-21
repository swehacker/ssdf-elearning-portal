package se.ssdf.elearning.services;

import se.ssdf.elearning.ImageSrc;
import se.ssdf.elearning.certificate.Certificate;
import se.ssdf.elearning.certificate.CertificateId;
import se.ssdf.elearning.certificate.CertificateType;
import se.ssdf.elearning.users.User;

import java.util.Date;
import java.util.List;

public interface CertificateService {
    /**
     * Creates a new certificate for ordering.
     *
     * @param student
     * @param instructor
     * @param certificateId
     * @param imageSrc
     * @return
     */
    Certificate order(User student, User instructor, CertificateId certificateId, ImageSrc imageSrc);

    Certificate beingProcessed(Certificate certificate, User administrator);

    Certificate processed(Certificate certificate, User administrator);

    Certificate delivered(Certificate certificate, User administrator);

    Certificate find(CertificateId id);

    List<Certificate> findBy(CertificateType type);

    List<Certificate> findBy(Date from, Date to);
}
