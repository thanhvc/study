package rxb.crm.web.department;

import javax.annotation.Resource;

import rxb.crm.model.Department;
import rxb.crm.service.DepartmentService;
import rxb.system.WebUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RemoveDepartmentAction extends ActionSupport implements ModelDriven<Department> {
	Department d;
	@Resource
	DepartmentService departmentService;
	
	@Override
	public String execute() throws Exception {
		if(d.getManager()==null){
			departmentService.deleteDepartment(d.getId());
			WebUtil.removeDepartmentList();
			return SUCCESS;
		}
		return INPUT;
	}
	
	@Override
	public Department getModel() {
		d=new Department();
		return d;
	}
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	public DepartmentService getDepartmentService() {
		return departmentService;
	}
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	
}
