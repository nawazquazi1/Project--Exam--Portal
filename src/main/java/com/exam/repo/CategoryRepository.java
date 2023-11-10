package com.exam.repo;

import com.exam.model.exams.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nawaz
 */
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
