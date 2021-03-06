package se.ssdf.elearning.services.user;

import javassist.NotFoundException;
import se.ssdf.elearning.users.User;

public interface UserRepository {
    /**
     * Returns a User if found or null if not.
     *
     * @param username
     * @return
     */
    User get(final String username) throws NotFoundException;

    /**
     * Stores a user in the database.
     *
     * @param username
     * @param password
     */
    User create(final String username, final String password);
}
