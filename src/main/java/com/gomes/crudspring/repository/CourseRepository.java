package com.gomes.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomes.crudspring.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}