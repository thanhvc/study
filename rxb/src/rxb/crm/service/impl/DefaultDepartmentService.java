package rxb.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import rxb.crm.dao.DepartmentDao;
import rxb.crm.model.Department;
import rxb.crm.service.DepartmentService;

@Service("departmentService")
public class DefaultDepartmentService implements DepartmentService {
	@Resource
	DepartmentDao departmentDao;
	
	@Override
	public void createDepartment(Department d) {
		departmentDao.insertDepartment(d);
	}

	@Override
	public void updateDepartment(Department d) {
		departmentDao.updateDepartment(d);

	}

	@Override
	public void deleteDepartment(Integer id) {
		departmentDao.deleteDepartment(id);

	}

	@Override
	public Department findById(Integer id) {
		return departmentDao.findById(id);
	}

	@Override
	public List<Department> findAll() {
		return departmentDao.findAll();
	}

	@Override
	public List<Department> findByKey(String key) {
		return departmentDao.findByKey(key);
	}

}
