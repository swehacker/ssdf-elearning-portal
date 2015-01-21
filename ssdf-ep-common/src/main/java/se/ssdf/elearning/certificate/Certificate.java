package se.ssdf.elearning.certificate;

import se.ssdf.elearning.users.User;

import java.util.Date;

public abstract class Certificate {
    private CertificateId certificateId;
    private CertificateType certificateType;
    private User student;
    private User instructor;
    private User administrator;
    private Status status;
    private Date created;

    public CertificateId getCertificateId() {
        return certificateId;
    }

    public CertificateType getCertificateType() {
        return certificateType;
    }

    public User getStudent() {
        return student;
    }

    public User getInstructor() {
        return instructor;
    }

    public User getAdministrator() {
        return administrator;
    }

    public Date getCreated() {
        return created;
    }
}
