package se.ssdf.elearning.services.certificate.jdbc;

interface SQL {
    String CERTIFICATE_DB_CREATE = "CREATE TABLE IF NOT EXISTS certificates (" +
            "id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT, " +
            "certid CHAR(20) NOT NULL UNIQUE, " +
            "certtype INT NOT NULL," +
            "personnr CHAR(12) NOT NULL," +
            "firstname VARCHAR(20) NOT NULL," +
            "lastname VARCHAR(30) NOT NULL," +
            "instructor CHAR(20) NOT NULL," +
            "creation_date DATE NOT NULL" +
            ")";

    String CERTIFICATE_INSERT = "INSERT INTO certificates (certid, certtype, personnr, firstname, lastname, instructor, creation_date) VALUES (?, ?, ?, ?, ?, ?, ?)";
    String CERTIFICATE_FIND_BY_TYPE = "SELECT certid, certtype, personnr, firstname, lastname, instructor, creation_date FROM certificates WHERE certtype = ? AND creation_date < ? AND creation_date > ? ORDER BY certid";

    String CERTSTATUS_DB_CREATE = "CREATE TABLE IF NOT EXISTS certstatus (" +
            "certid CHAR(20) NOT NULL, " +
            "status VARCHAR(30) NOT NULL," +
            "creation_date DATE NOT NULL" +
            ")";

    String CERTSTATUS_INSERT = "INSERT INTO certstatus (certid, status, creation_date) VALUES (?, ?, ?)";

    String CERTTYPE_DB_CREATE = "CREATE TABLE IF NOT EXISTS certificate_types (" +
            "id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT, " +
            "name VARCHAR(50) NOT NULL" +
            ")";

    String CERTTYPE_INSERT = "INSERT INTO certtype (name) VALUES (?)";
    String CERTTYPE_SELECT = "SELECT id, name FROM certtype ORDER BY certtype";
}
