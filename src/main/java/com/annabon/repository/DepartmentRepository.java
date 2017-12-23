package com.annabon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.annabon.entity.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
