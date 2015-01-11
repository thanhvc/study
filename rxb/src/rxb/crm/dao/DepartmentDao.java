package rxb.crm.dao;

import java.util.List;

import rxb.crm.model.Department;

public interface DepartmentDao {
	public void insertDepartment(Department d);
	public void updateDepartment(Department d);
	public void deleteDepartment(Integer id);
	public Department findById(Integer id);
	public List<Department> findAll();
	public List<Department> findByKey(String key);
}