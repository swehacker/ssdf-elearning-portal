package se.ssdf.elearning.services.user.mongodb;

import org.springframework.data.mongodb.core.mapping.Document;
import se.ssdf.elearning.User;

@Document(collection = "users")
public class UserDO implements User {
    private final String username;
    private final String password;

    UserDO(final String userName, final String password) {
        this.username = userName;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }
}
