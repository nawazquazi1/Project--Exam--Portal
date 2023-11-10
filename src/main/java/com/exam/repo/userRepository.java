package com.exam.repo;

import com.exam.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nawaz
 */
public interface userRepository extends JpaRepository<User,Long> {
    User findByuserName(String userName);
}
