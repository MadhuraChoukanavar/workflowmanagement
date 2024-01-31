package org.crnts.adminservice.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.crnts.adminservice.controller.DepartmentController;
import org.crnts.adminservice.entity.DepartmentEntity;
import org.crnts.adminservice.exception.DepartmentNotFoundException;
import org.crnts.adminservice.repository.DepartmentRepository;
import org.crnts.adminservice.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DepartmentServiceImp implements DepartmentService {
	private static Logger log = LoggerFactory.getLogger(DepartmentController.class);
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public void save(DepartmentEntity departmentEntity) {
		departmentRepository.save(departmentEntity);
		log.info("Department details saved", departmentEntity);
	}

	@Override

	public DepartmentEntity get(Long departmentId) {


	public DepartmentEntity getDepartmentById(Long departmentId) {

		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public List<DepartmentEntity> getAll() {



		return departmentRepository.findAll();
	}

	@Override
	public void update(DepartmentEntity departmentEntity) throws DepartmentNotFoundException {
		Optional<DepartmentEntity> optional = departmentRepository.findById(departmentEntity.getDepartmentId());
		if (optional.isPresent()) {
			departmentRepository.save(departmentEntity);
			System.out.println("update successfull");
		} else {

			throw new DepartmentNotFoundException(
					"DepartmentNotFoundExceptionbyDepartmentId-" + departmentEntity.getDepartmentId());
		}

	}

	@Override
	public DepartmentEntity delete(Long departmentId) {
		Optional<DepartmentEntity> optional = departmentRepository.findById(departmentId);
		if (optional.isPresent()) {
			departmentRepository.deleteById(departmentId);
			;
			System.out.println("deleted successfull");
		} else {
			optional.orElseThrow();
		}
		return null;

	}

}
