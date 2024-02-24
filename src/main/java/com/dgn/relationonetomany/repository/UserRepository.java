package com.dgn.relationonetomany.repository;

import com.dgn.relationonetomany.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
