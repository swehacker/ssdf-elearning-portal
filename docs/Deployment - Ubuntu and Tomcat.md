On an Ubuntu box, using a `sudoer` user (named `install` below).

### Pre-req
* Tomcat 7
* JDK8

Kontrollera att rätt version är installerad:

```bash
java -version
```

### Konfigurera Tomcat

Stop Tomcat:

```bash
sudo service tomcat7 stop
```

#### Installation av extra bibliotek

I `/usr/share/tomcat7/lib`, lägg till följande:

* H2 eller MySQL database driver som du hittar på respektive sida. 
* Java mail libraries - `mail.jar` - Hittar du på oracles sida http://www.oracle.com/technetwork/java/index-138643.html

Ändra ägaren av filerna till root:

```bash
sudo chown root:root /home/install/*.jar
```

#### Tomcat environment variables

Edit the `JAVA_OPTS` definition in `/etc/default/tomcat`:

```bash
JAVA_OPTS="-Dspring.profiles.active=prod -Djava.awt.headless=true -Xmx128m -XX:+UseConcMarkSweepGC"
```

#### Remove the ROOT application

Remove the root application:

```bash
sudo rm -rf /var/lib/tomcat7/webapps/ROOT
```

#### Skapa en SSDF katalog (bara för H2 databas)

```bash
sudo mkdir -p /opt/ssdf/elearning/db
sudo chown -R tomcat7:tomcat7 /opt/ssdf
```

#### Lägg upp konfiguration

Put the default configuration file in `/var/lib/tomcat7/conf/Catalina/localhost` as `ROOT.xml`.

#### Deploying the application

Copy the `ssdf` WAR into `/var/lib/tomcat7/webapps` as `ROOT.war`.

#### Restart Tomcat:

```bash
sudo service tomcat7 start
```