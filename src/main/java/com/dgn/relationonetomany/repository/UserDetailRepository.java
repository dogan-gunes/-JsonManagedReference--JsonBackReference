package com.dgn.relationonetomany.repository;

import com.dgn.relationonetomany.model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepository extends JpaRepository<UserDetail, Long> {
}
