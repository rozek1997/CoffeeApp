package com.example.coffeeworld.POJO;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UserAuthorization implements UserDetails {


    Collection<? extends GrantedAuthority> authorities;
    private String username;
    private String password;

    /**
     * constructor
     * @param username
     * @param password
     * @param authorities
     */
    public UserAuthorization(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    /**
     * returns hash code
     * @return hashCode
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * returns authorizations
     * @return authorities
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    /**
     * returns password
     * @return password
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * returns username
     * @return username
     */
    @Override
    public String getUsername() {
        return username;
    }

    /**
     * returns information about expiration
     * @return bool
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * returns informaion wheter account is locked or not
     * @return bool
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * returns info about credential's expiration
     * @return bool
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * returns info wheter account is enabled
     * @return bool
     */
    @Override
    public boolean isEnabled() {
        return true;
    }
}
