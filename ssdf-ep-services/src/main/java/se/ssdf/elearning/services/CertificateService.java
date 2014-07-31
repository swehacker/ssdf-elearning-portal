package se.ssdf.elearning.services;

import se.ssdf.elearning.Administrator;
import se.ssdf.elearning.ImageSrc;
import se.ssdf.elearning.Instructor;
import se.ssdf.elearning.Student;
import se.ssdf.elearning.certificate.Certificate;
import se.ssdf.elearning.certificate.CertificateId;
import se.ssdf.elearning.certificate.CertificateType;

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
    Certificate order(Student student, Instructor instructor, CertificateId certificateId, ImageSrc imageSrc);

    Certificate beingProcessed(Certificate certificate, Administrator administrator);

    Certificate processed(Certificate certificate, Administrator administrator);

    Certificate delivered(Certificate certificate, Administrator administrator);

    Certificate find(CertificateId id);

    List<Certificate> findBy(CertificateType type);

    List<Certificate> findBy(Date from, Date to);
}
