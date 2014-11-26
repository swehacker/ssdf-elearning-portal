## Set up Intellij development environment
### Preconfigured (H2) Database
The development environment is using H2 for test and is preconfigured to use /opt/ssdf-elearning as db home.
You need to create a `/opt/ssdf-elearning` and set the owner to your account to allow the tomcat to create the database.

```
sudo mkdir -p /opt/ssdf-elearning
sudo chown <your username> /opt/ssdf-elearning
```

### Other database
The development environment is using H2 for test, but you can change database by modifying the META-INF/context.xml

```
<!-- JDBC datasource -->
<Resource name="jdbc/ssdfdb"
          auth="Container"
          type="javax.sql.DataSource"
          factory="org.apache.tomcat.jdbc.pool.DataSourceFactory"
          maxActive="20"
          minIdle="5"
          maxIdle="10"
          maxWait="1000"
          maxAge="1200000"
          removeAbandoned="true"
          removeAbandonedTimeout="60"
          testWhileIdle="true"
          validationQuery="SELECT 1"
          timeBetweenEvictionRunsMillis="60000"
          logAbandoned="true"
          defaultAutoCommit="false"
          username="ssdf"
          password="ssdf"
          driverClassName="org.h2.Driver"
          url="jdbc:h2:/opt/ssdf-elearning/db/data;AUTOCOMMIT=OFF;MODE=MySQL"
        />
```