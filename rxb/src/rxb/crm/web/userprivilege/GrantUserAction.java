package rxb.crm.web.userprivilege;

import java.util.List;
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

public class GrantUserAction extends ActionSupport implements ModelDriven<UserPrivilege>{
	List<Integer> uidList;
	
	Integer urlId;
	
	UserPrivilege up;
	@Resource
	UserService userService;
	@Resource
	ModuleURLService moduleURLService;
	@Resource
	UserPrivilegeService userPrivilegeService;
	
	
	@Override
	public String execute() throws Exception {
		ModuleURL mu;
		User user;		
		for(int i=0;i<uidList.size();i++){
			
			if(userPrivilegeService.findById(uidList.get(i),urlId)!=null){
				up=userPrivilegeService.findById(uidList.get(i),urlId);
				up.setMask('1');
				userPrivilegeService.updateUserPrivilege(up);
			}else{
				user=userService.findById(uidList.get(i));
				up.setUser(user);
				mu=moduleURLService.findById(urlId);
				up.setModuleURL(mu);
				up.setMask('1');
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



	public List<Integer> getUidList() {
		return uidList;
	}


	public void setUidList(List<Integer> uidList) {
		this.uidList = uidList;
	}


	public Integer getUrlId() {
		return urlId;
	}


	public void setUrlId(Integer urlId) {
		this.urlId = urlId;
	}


	@Override
	public UserPrivilege getModel() {
		up=new UserPrivilege();
		return up;
	}

}
