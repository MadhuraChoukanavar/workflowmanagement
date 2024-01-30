package org.crnts.adminservice.repository;

import java.util.List;

import org.crnts.adminservice.entity.DepartmentEntity;
import org.crnts.adminservice.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

	List<EmployeeEntity> findByEmployeeDepartmentId(DepartmentEntity department);
}
