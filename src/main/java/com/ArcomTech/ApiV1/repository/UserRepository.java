package com.ArcomTech.ApiV1.repository;

import com.ArcomTech.ApiV1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;




@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByName(@Param("name") String name);
}
