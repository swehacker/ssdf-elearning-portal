package se.ssdf.elearning.services;

import javassist.NotFoundException;
import se.ssdf.elearning.users.User;
import se.ssdf.elearning.exception.AlreadyExistException;
import se.ssdf.elearning.exception.PasswordException;

public interface UserService {
    /**
     * Returns a user if found.
     *
     * @param username
     * @return
     * @throws NotFoundException
     */
    User get(String username) throws NotFoundException;

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
