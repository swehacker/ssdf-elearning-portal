package se.ssdf.elearning.services.user.mongodb;

import org.springframework.data.mongodb.core.mapping.Document;
import se.ssdf.elearning.users.User;

@Document(collection = "users")
public class UserDO implements User {
    private final String username;
    private final String password;

    UserDO(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public String getPassword() { return password; }
}
