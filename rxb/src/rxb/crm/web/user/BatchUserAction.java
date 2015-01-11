package rxb.crm.web.user;

import java.util.List;

import javax.annotation.Resource;

import rxb.crm.model.User;
import rxb.crm.model.UserPrivilege;
import rxb.crm.service.ModuleURLService;
import rxb.crm.service.UserPrivilegeService;
import rxb.crm.service.UserService;
import rxb.system.WebUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BatchUserAction extends ActionSupport implements ModelDriven<User> {
	List<Integer> idList;
	User user;
	@Resource
	UserService userService;
	@Resource
	ModuleURLService moduleURLService;
	@Resource
	UserPrivilegeService userPrivilegeService;
	public String remove(){
		
		if(idList!=null&&idList.size()>0){
			List<UserPrivilege> userPrivilegeList=moduleURLService.listUserPrivilege(user);
			for(int i=0;i<userPrivilegeList.size();i++){
				userPrivilegeService.deleteUserPrivilege(userPrivilegeList.get(i).getId());
			}
			userService.deleteUsers(idList);
		}else{
			List<UserPrivilege> userPrivilegeList=moduleURLService.listUserPrivilege(user);
			for(int i=0;i<userPrivilegeList.size();i++){
				userPrivilegeService.deleteUserPrivilege(userPrivilegeList.get(i).getId());
			}
			userService.deleteUser(user.getId());
			WebUtil.removeUserList();
		}
		return SUCCESS;
	}
	
	public String reset(){
		if(idList!=null&&idList.size()>0){
			userService.resetUsers(idList);
		}else{
			userService.reset(user.getId());
			
		}
		
		
		return SUCCESS;
	}
	
	public String status(){
		if(idList!=null&&idList.size()>0){
			userService.statusUsers(idList);
		}else{
			userService.status(user.getId());
			
		}
		
		return SUCCESS;
	}
	
	public List<Integer> getIdList() {
		return idList;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
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

	public ModuleURLService getModuleURLService() {
		return moduleURLService;
	}

	@Override
	public User getModel() {
		user =new User();
		return user;
	}

}
