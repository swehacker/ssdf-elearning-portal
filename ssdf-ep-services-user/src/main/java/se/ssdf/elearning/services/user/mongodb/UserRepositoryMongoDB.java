package se.ssdf.elearning.services.user.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import se.ssdf.elearning.User;
import se.ssdf.elearning.services.user.UserRepository;

@Service(value = "userRepository")
public class UserRepositoryMongoDB implements UserRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public User get(String username) {
        Query searchUserQuery = new Query(Criteria.where("username").is(username));
        return mongoTemplate.findOne(searchUserQuery, UserDO.class);
    }

    @Override
    public User create(String username, String password) {
        User user = new UserDO(username, password);
        mongoTemplate.save(user);

        return user;
    }
}
