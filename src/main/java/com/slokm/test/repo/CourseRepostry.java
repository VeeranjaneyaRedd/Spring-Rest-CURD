package com.slokm.test.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.slokm.test.binding.Course;

@Repository
public interface CourseRepostry extends JpaRepository<Course, Serializable> {

}
