package com.example.norush.repository;

import com.example.norush.domain.RefreshToken;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends MongoRepository<RefreshToken, String> {
    Optional<RefreshToken> findByMemberId(String memberId);

    void deleteByMemberId(String memberId);
}
