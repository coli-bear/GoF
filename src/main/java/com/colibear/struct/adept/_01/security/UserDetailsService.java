package com.colibear.struct.adept._01.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
