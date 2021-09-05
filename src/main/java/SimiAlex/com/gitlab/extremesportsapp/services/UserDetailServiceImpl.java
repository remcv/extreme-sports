package SimiAlex.com.gitlab.extremesportsapp.services;

import SimiAlex.com.gitlab.extremesportsapp.model.UserJpa;
import SimiAlex.com.gitlab.extremesportsapp.repositories.UserRepository;
import SimiAlex.com.gitlab.extremesportsapp.security.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserJpa user = userRepository.findByUsername(s).orElseThrow(()->new UsernameNotFoundException("User not found"));
        return new UserDetailsImpl(user);
    }
}
