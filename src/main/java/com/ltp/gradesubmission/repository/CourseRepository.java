package com.ltp.gradesubmission.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.gradesubmission.entity.Grade;
import com.ltp.gradesubmission.entity.Course;
import com.ltp.gradesubmission.entity.Student;


public interface CourseRepository extends CrudRepository<Course, Long> {

}