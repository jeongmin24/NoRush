package com.example.norush.config;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptPasswordEncoder {

    public static String encode(String rawPassword) {
        return BCrypt.hashpw(rawPassword, BCrypt.gensalt());
    }

    public static boolean matches(String rawPassword, String encodedPassword) {
        return BCrypt.checkpw(rawPassword, encodedPassword);
    }
}