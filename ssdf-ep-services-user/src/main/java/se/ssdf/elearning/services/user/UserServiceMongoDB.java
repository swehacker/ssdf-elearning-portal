package se.ssdf.elearning.services.user;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.ssdf.elearning.users.User;
import se.ssdf.elearning.exception.AlreadyExistException;
import se.ssdf.elearning.exception.PasswordException;
import se.ssdf.elearning.services.UserService;

@Service(value = "UserService")
public class UserServiceMongoDB implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User get(String username) throws NotFoundException {
        return userRepository.get(username);
    }

    @Override
    public User createAccount(String username, String password) throws PasswordException, AlreadyExistException {
        return userRepository.create(username, password);
    }

    @Override
    public void changePassword(User user, String password) throws PasswordException {

    }
}
