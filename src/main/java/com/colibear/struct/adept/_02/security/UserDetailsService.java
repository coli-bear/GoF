package com.colibear.struct.adept._02.security;

// Target interface
public interface UserDetailsService {
    UserDetails loadUser(String username);
}
