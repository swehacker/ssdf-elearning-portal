# Hardening

## Enabling the firewall:

```bash
sudo ufw enable
```

### Opening the SSH port (if you still want to access the server later...):

```bash
sudo ufw allow ssh
```

### Opening the HTTP port:

```bash
sudo ufw allow http
```

### Opening the SSL port:

```bash
sudo ufw allow 443/tcp
```

