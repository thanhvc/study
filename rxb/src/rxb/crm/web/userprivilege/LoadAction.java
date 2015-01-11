package rxb.crm.web.userprivilege;

import java.util.List;

import javax.annotation.Resource;

import rxb.crm.model.ModuleURL;
import rxb.crm.model.User;
import rxb.crm.service.ModuleURLService;
import rxb.crm.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class LoadAction extends ActionSupport {
	Integer id;
	User user;
	List list;
	@Resource
	UserService userService;
	@Resource
	ModuleURLService moduleURLService;
	@Override
	public String execute() throws Exception {
		user=userService.findById(id);
		list=moduleURLService.findAll(id);
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.push(user);
		return SUCCESS;
	}

	


	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public ModuleURLService getModuleURLService() {
		return moduleURLService;
	}
	public void setModuleURLService(ModuleURLService moduleURLService) {
		this.moduleURLService = moduleURLService;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
	

}
