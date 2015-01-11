package rxb.crm.service;

import java.util.List;

import rxb.crm.model.Department;

public interface DepartmentService {
	public void createDepartment(Department d);
	public void updateDepartment(Department d);
	public void deleteDepartment(Integer id);
	public Department findById(Integer id);
	public List<Department> findAll();
	public List<Department> findByKey(String key);
}
