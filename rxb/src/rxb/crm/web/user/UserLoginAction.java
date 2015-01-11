package rxb.crm.web.user;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.SessionAware;

import rxb.crm.model.Module;
import rxb.crm.model.User;
import rxb.crm.model.UserPrivilege;
import rxb.crm.service.ModuleURLService;
import rxb.crm.service.UserPrivilegeService;
import rxb.crm.service.UserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserLoginAction extends ActionSupport implements SessionAware {
	
	String username;
	String password;
	List<Module> moduleList;
	List<UserPrivilege> userPrivilegeList;
	@Resource
	UserService userService;
	@Resource
	ModuleURLService moduleURLService;
	
	Map<String,Object> session;
	
	@Override
	public void validate() {
		if(username==null||username.trim().length()==0){
			this.addFieldError("username", "用户名不能为空");
		}
	}
	
	@Override
	public String execute() throws Exception {
		User user=userService.find(username,password);
		if(user!=null){
			if(user.getStatus()=='0'){
				this.addFieldError("statu", "用户处于关闭状态");
				return INPUT;
			}
			session.put("USER", user);
			moduleList=moduleURLService.listUserModule(user);
			session.put("MODULE", moduleList);
			userPrivilegeList=moduleURLService.listUserPrivilege(user);
			session.put("USERPRIVILEGE", userPrivilegeList);
			return SUCCESS;
		}else
		this.addFieldError("password", "用户名或者密码不正确，请重新输入");
		return INPUT;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public Map<String, Object> getSession() {
		return session;
	}


	public ModuleURLService getModuleURLService() {
		return moduleURLService;
	}


	public void setModuleURLService(ModuleURLService moduleURLService) {
		this.moduleURLService = moduleURLService;
	}
	
	

}
