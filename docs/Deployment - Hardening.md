# Hardening

##Enabling the firewall:

```bash
sudo ufw enable
```

### Opening the SSH port (if you still want to access the server later...):

```bash
sudo ufw allow ssh
```

### Opening the SSL port:

```bash
sudo ufw allow 443/tcp
```

