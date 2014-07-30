package se.ssdf.elearning.services;

import se.ssdf.elearning.common.*;

public interface CertificateService {
    /**
     * Creates a new certificate
     * @param student
     * @param instructor
     * @param certificateId
     * @param imageSrc
     * @param administrator
     * @return
     */
    Certificate create(Student student, Instructor instructor, CertificateId certificateId, ImageSrc imageSrc, Administrator administrator);

    Certificate find(CertificateId id);


}
