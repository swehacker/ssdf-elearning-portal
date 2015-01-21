package se.ssdf.elearning.services.user.mongodb;

import javassist.NotFoundException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import se.ssdf.elearning.services.UserService;
import se.ssdf.elearning.users.Role;
import se.ssdf.elearning.users.User;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class MongoUserDetailsService implements UserDetailsService {

    @Resource
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;

        try {
            User user = getUserDetail(username);
            return new org.springframework.security.core.userdetails.User(user.getUsername(),
                    ((UserDO)user).getPassword(),
                    ((UserDO)user).isEnabled(),
                    ((UserDO)user).isAccountNonExpired(),
                    ((UserDO)user).isCredentialsNonExpired(),
                    ((UserDO)user).isAccountNonLocked(),
                    getAuthorities());

        } catch (NotFoundException nfe) {
            throw new UsernameNotFoundException(nfe.getMessage());
        }
    }

    public List<GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authList = new ArrayList<>();
        authList.add(new SimpleGrantedAuthority(Role.USER.getName()));

        return authList;
    }

    private User getUserDetail(String username) throws NotFoundException {
        return userService.get(username);
    }
}
