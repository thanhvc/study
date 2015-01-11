package rxb.crm.web.department;

import java.util.List;

import javax.annotation.Resource;

import rxb.crm.model.Department;
import rxb.crm.model.User;
import rxb.crm.service.DepartmentService;
import rxb.crm.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class LoadAction extends ActionSupport {
	Integer id;
	Department department;
	
	@Resource 
	DepartmentService departmentService;
	
	@Override
	public String execute() throws Exception {
		if(id!=null&&id>0){
			department=departmentService.findById(id);
		}else{
			department=new Department();
		}
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.push(department);
		
		return SUCCESS;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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



}
