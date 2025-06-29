package com.example.norush.config;

import jakarta.servlet.http.HttpServletRequest;
import java.util.Optional;
import org.springframework.util.StringUtils;

public class AuthenticationExtractor {
    private static final String AUTHORIZATION_HEADER = "Authorization";
    private static final String BEARER = "Bearer";

    public static Optional<String> extract(HttpServletRequest request) {
        String header = request.getHeader(AUTHORIZATION_HEADER);
        if (!StringUtils.hasText(header)) {
            return Optional.empty();
        }
        return checkMatch(header.split(" "));
    }

    public static Optional<String> extract(String header) {
        if (!StringUtils.hasText(header)) {
            return Optional.empty();
        }
        return checkMatch(header.split(" "));
    }

    private static Optional<String> checkMatch(String[] parts) {
        if (parts.length == 2 && parts[0].equals(BEARER)) {
            return Optional.ofNullable(parts[1]);
        }
        return Optional.empty();
    }
}
