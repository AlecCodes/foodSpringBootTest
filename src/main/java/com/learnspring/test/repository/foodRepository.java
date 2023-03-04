package com.learnspring.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.learnspring.test.entity.food;
public interface foodRepository extends JpaRepository<food, Integer> {
}
