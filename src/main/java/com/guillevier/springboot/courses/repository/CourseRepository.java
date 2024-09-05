package com.guillevier.springboot.courses.repository;

import com.guillevier.springboot.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
