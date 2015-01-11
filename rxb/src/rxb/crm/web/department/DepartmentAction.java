package rxb.crm.web.department;

import javax.annotation.Resource;

import rxb.crm.model.Department;
import rxb.crm.service.DepartmentService;
import rxb.system.WebUtil;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class DepartmentAction extends ActionSupport implements ModelDriven<Department>{

	Department department;

	@Resource
	DepartmentService departmentService;
	
	@Override
	public void validate() {
		if(department.getName()==null||department.getName().trim().length()==0){
			this.addFieldError("name", "请输入部门名称");
		}
	}

	public String execute() throws Exception {
		if(department.getId()!=null&&department.getId()>0){
			departmentService.updateDepartment(department);
		}else{
			departmentService.createDepartment(department);	
			WebUtil.removeDepartmentList();
		}
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.push(department);
		return SUCCESS;
		
	}
	
	@Override
	public Department getModel() {
		department=new Department();
		return department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

}
