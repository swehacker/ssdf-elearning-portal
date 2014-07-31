package se.ssdf.elearning.certificate;

import se.ssdf.elearning.Administrator;
import se.ssdf.elearning.Instructor;
import se.ssdf.elearning.Student;

import java.util.Date;

public abstract class Certificate {
    private CertificateId certificateId;
    private CertificateType certificateType;
    private Student student;
    private Instructor instructor;
    private Administrator administrator;
    private Status status;
    private Date created;

    public CertificateId getCertificateId() {
        return certificateId;
    }

    public CertificateType getCertificateType() {
        return certificateType;
    }

    public Student getStudent() {
        return student;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public Date getCreated() {
        return created;
    }
}
