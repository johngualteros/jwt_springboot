package com.john.jwt_springboot.security;

import com.john.jwt_springboot.repository.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private User userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        com.john.jwt_springboot.model.User user = userRepository
                .findOneByEmail(email)
                .orElseThrow(()-> new UsernameNotFoundException("THE USER NOT EXISTS WITH THE EMAIL" + email));

        return new UserDetailsImpl(user);
    }
}
