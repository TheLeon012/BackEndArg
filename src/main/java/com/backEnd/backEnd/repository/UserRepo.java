package com.backEnd.backEnd.repository;


import com.backEnd.backEnd.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);
}
