package org.crnts.adminservice.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

<<<<<<< HEAD

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
=======
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
>>>>>>> master
@Entity
@Table(name = "department_details")
public class DepartmentEntity {
	
	@Id
	@Column(name = "department_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
 private long departmentId;
	@Column(name = "department_name")
 private String departmentName;
	
=======
	private long departmentId;
>>>>>>> master
	
	@Column(name = "department_name")
	private String departmentName;

	@OneToMany(mappedBy = "employeeDepartmentId" ,cascade = CascadeType.ALL)
    private List<EmployeeEntity> employees;
}
