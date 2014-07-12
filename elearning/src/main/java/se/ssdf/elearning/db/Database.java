package se.ssdf.elearning.db;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
    private static final Database _instance = new Database();
    private DataSource ds;

    private Database() {
    }

    public static Connection getConnection() throws NamingException, SQLException {
        if (_instance.ds == null) {
            init();
        }

        return _instance.ds.getConnection();
    }

    private static synchronized void init() throws NamingException {
        Context c = new InitialContext();
        _instance.ds = (DataSource) c.lookup("java:comp/env/jdbc/eLearningDS");
        c.close();
    }

    public static void close(Connection conn) throws SQLException {
        if (conn != null) conn.close();
    }

    public static void close(ResultSet rs) throws SQLException {
        if (rs != null) rs.close();
    }

    public static void close(PreparedStatement pStat) throws SQLException {
        if (pStat != null) pStat.close();

    }

    public static void close(Connection conn, PreparedStatement pStat, ResultSet rs) throws SQLException {
        close(rs);
        close(pStat);
        close(conn);
    }

    public static void close(Connection conn, PreparedStatement pStat) throws SQLException {
        close(pStat);
        close(conn);
    }

    public static void close(PreparedStatement pStat, ResultSet rs) throws SQLException {
        close(rs);
        close(pStat);
    }
}