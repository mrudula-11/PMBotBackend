package com.example.myjwt.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.myjwt.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUserName(String userName);
	
	User findByEmail(String email);

	Boolean existsByUserName(String userName);

	Boolean existsByEmail(String email);

    public User findByVerificationCode(String verificationCode);
	
}
