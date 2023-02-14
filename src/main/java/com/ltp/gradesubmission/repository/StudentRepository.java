package com.ltp.gradesubmission.repository;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;

import com.ltp.gradesubmission.entity.Grade;
import com.ltp.gradesubmission.entity.Course;
import com.ltp.gradesubmission.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}