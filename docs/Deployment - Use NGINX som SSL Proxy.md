### nginx as a SSL proxy

Install `nginx`:

```bash
sudo apt-get install nginx
```

Remove default configuration:

```bash
cd /etc/nginx/sites-available
sudo rm default ../sites-enabled/default
```

For the SSL certificates, create a new directory:

```
sudo mkdir /etc/nginx/ssl
```

Create the server key with a pass phrase:

```
cd /etc/nginx/ssl
sudo openssl genrsa -des3 -out server.key 1024
```

Create the server certificate:

```
sudo openssl req -new -key server.key -out server.csr
```

Remove the passphrase:

```
sudo cp server.key server.key.org
sudo openssl rsa -in server.key.org -out server.key
```

Sign the certificate:

```
sudo openssl x509 -req -days 365 -in server.csr -signkey server.key -out server.crt
```

Create the `/etc/nginx/sites-available/<your site>` file and set the following content:

```
upstream app_server {
    server 127.0.0.1:8080 fail_timeout=0;
}

server {
    listen 443;
    listen [::]:443 default ipv6only=on;
    server_name elearning.ssdf.se;

    ssl on;
    ssl_certificate /etc/nginx/ssl/server.crt;
    ssl_certificate_key /etc/nginx/ssl/server.key;

    location / {
        proxy_set_header Host $http_host;
        proxy_set_header X-Real-IP $remote_addr;
        proxy_set_header X-Forwarded-Proto https;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_redirect http:// https://;

        add_header Pragma "no-cache";

        proxy_pass http://app_server;
    }
}
```

Link your configuration from sites-available to sites-enabled:

```bash
sudo ln -s /etc/nginx/sites-available/<your site> /etc/nginx/sites-enabled/
```

Configure Tomcat in proxy mode by editing the `<Connector>` node in `/var/lib/tomcat7/conf/server.xml`:

```xml
<Connector port="8080" protocol="HTTP/1.1"
    connectionTimeout="20000"
    URIEncoding="UTF-8"
    redirectPort="8443"
    scheme="https"
    proxyPort="443" />
```

Note the addition of `scheme` and `proxyPort`.

Restart Nginx:

```bash
sudo service nginx restart
```

### Resources
* http://webapp.org.ua/sysadmin/setting-up-nginx-ssl-reverse-proxy-for-tomcat/ (the `scheme` trick)