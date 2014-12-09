package se.ssdf.elearning.certificate;

import se.ssdf.elearning.users.roles.Administrator;
import se.ssdf.elearning.users.roles.Instructor;
import se.ssdf.elearning.users.roles.Student;

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
