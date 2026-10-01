package com.JForceTask.demo.Repo;


import com.JForceTask.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User ,Long> {
    Optional<User> findByEmail(String email);

}
