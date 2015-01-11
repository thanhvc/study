package rxb.crm.web.department;

import java.util.List;

import javax.annotation.Resource;

import rxb.crm.model.Department;
import rxb.crm.service.DepartmentService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ListDepartmentAction extends ActionSupport {
	List<Department> departmentList;
	@Resource
	DepartmentService departmentService;
	
	public String execute(){
		departmentList=departmentService.findAll();
		return SUCCESS;
	}

	

	public List<Department> getDepartmentList() {
		return departmentList;
	}



	public void setDepartmentList(List<Department> departmentList) {
		this.departmentList = departmentList;
	}



	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	

}
