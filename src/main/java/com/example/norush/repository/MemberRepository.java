package com.example.norush.repository;

import com.example.norush.domain.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MemberRepository extends MongoRepository<Member, String> {
    Optional<Member> findByEmail(String email);
    Optional<Member> findByUsername(String username);
}
