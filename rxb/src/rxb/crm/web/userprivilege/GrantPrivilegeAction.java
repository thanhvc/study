package rxb.crm.web.userprivilege;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import rxb.crm.model.ModuleURL;
import rxb.crm.model.User;
import rxb.crm.model.UserPrivilege;
import rxb.crm.service.ModuleURLService;
import rxb.crm.service.UserPrivilegeService;
import rxb.crm.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GrantPrivilegeAction extends ActionSupport implements ModelDriven<UserPrivilege>{
	List<Integer> midList;
	
	Integer userId;
	

	UserPrivilege up;
	
	@Resource
	UserService userService;
	@Resource
	ModuleURLService moduleURLService;
	@Resource
	UserPrivilegeService userPrivilegeService;
	
	
	@Override
	public String execute() throws Exception {
		
		
		for(int i=0;i<midList.size();i++){
			ModuleURL mu;
			User user;
			if(userPrivilegeService.findById(userId, midList.get(i))!=null){
				up=userPrivilegeService.findById(userId, midList.get(i));
				up.setMask('1');
				userPrivilegeService.updateUserPrivilege(up);
			}else{
				user=userService.findById(userId);
				up.setUser(user);
				up.setMask('1');
				mu=moduleURLService.findById(midList.get(i));
				up.setModuleURL(mu);
				userPrivilegeService.createUserPrivilege(up);
			}
		}
		return SUCCESS;
	}



	public UserPrivilege getUp() {
		return up;
	}


	public void setUp(UserPrivilege up) {
		this.up = up;
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


	public UserPrivilegeService getUserPrivilegeService() {
		return userPrivilegeService;
	}


	public void setUserPrivilegeService(UserPrivilegeService userPrivilegeService) {
		this.userPrivilegeService = userPrivilegeService;
	}


	public List<Integer> getMidList() {
		return midList;
	}


	public void setMidList(List<Integer> midList) {
		this.midList = midList;
	}
	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	


	@Override
	public UserPrivilege getModel() {
		up=new UserPrivilege();
		return up;
	}

}
