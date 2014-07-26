package se.ssdf.elearning.config;

import net.sf.dbinit.DBInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DBConfig {

    public static final int VERSION = 4;

    @Autowired
    private DataSource dataSource;

    @Bean
    public DBInit createConfig() {
        DBInit db = new DBInit();
        db.setVersion(VERSION);
        db.setJdbcDataSource(dataSource);
        db.setVersionTable("VERSION");
        db.setVersionColumnName("VALUE");
        db.setVersionColumnTimestamp("UPDATED");
        db.setResourceInitialization("/META-INF/db/init.sql");
        db.setResourceUpdate("/META-INF/db/update.{0}.sql");
        return db;
    }

}
