package com.example.coffeeworld.Service;

import com.example.coffeeworld.POJO.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserAuthorizationService implements UserDetailsService {

    @Autowired
    private AccountService accountService;

    /**
     * loads user by its username
     * @param username
     * @return user
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Account> userAuthorization = accountService.findUserByUsername(username);
        if (userAuthorization == null) throw new UsernameNotFoundException(username);

        return new User(userAuthorization.get().getUsername(), userAuthorization.get().getPassword(),
                AuthorityUtils.createAuthorityList("ROLE_ADMIN", "ROLE_USER"));
    }
}
