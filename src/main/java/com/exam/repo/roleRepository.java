package com.exam.repo;

import com.exam.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nawaz
 */
public interface roleRepository extends JpaRepository<Role,Long> {

}
