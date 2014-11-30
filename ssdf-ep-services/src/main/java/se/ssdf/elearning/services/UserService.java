package se.ssdf.elearning.services;

import se.ssdf.elearning.User;
import se.ssdf.elearning.exception.AlreadyExistException;
import se.ssdf.elearning.exception.PasswordException;

public interface UserService {
    /**
     * Creates a new user with username and password. Throws PasswordException if the password/username is invalid,
     * throws AlreadyExistException if the username is already taken.
     *
     * @param username
     * @param password
     * @return
     */
    User createAccount(final String username, final String password) throws PasswordException, AlreadyExistException;

    /**
     * Changes password, will throw PasswordException if the password is invalid.
     *
     * @param user
     * @param password
     * @throws PasswordException
     */
    void changePassword(final User user, final String password) throws PasswordException;
}
