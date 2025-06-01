package com.marciosales.santander_dev_week.repository;

import com.marciosales.santander_dev_week.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
