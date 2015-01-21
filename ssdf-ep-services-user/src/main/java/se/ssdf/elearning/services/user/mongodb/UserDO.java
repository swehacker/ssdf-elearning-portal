package se.ssdf.elearning.services.user.mongodb;

import org.springframework.data.mongodb.core.mapping.Document;
import se.ssdf.elearning.users.Role;
import se.ssdf.elearning.users.User;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")
public class UserDO implements User {

    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private String phonenumber;
    private boolean enabled = true;
    private boolean accountNonExpired = true;
    private boolean credentialsNonExpired = true;
    private boolean accountNonLocked = true;
    private final List<Role> roles = new ArrayList<>();

    UserDO() { }

    UserDO(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    UserDO(final String username, final String password, final String firstname, final String lastname, final String email, final String phonenumber) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    public UserDO setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserDO setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserDO setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public UserDO setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public UserDO setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserDO setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }

    public UserDO setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public UserDO setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
        return this;
    }

    public UserDO setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
        return this;
    }

    public UserDO setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
        return this;
    }

    public UserDO addRole(Role role) {
        roles.add(role);
        return this;
    }
}
