package rxb.crm.web.userprivilege;

import java.util.List;

import javax.annotation.Resource;

import rxb.crm.model.User;
import rxb.crm.model.UserPrivilege;
import rxb.crm.service.ModuleURLService;
import rxb.crm.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class ListUserPrivilegeAction extends ActionSupport {
	List<UserPrivilege> userPrivilegeList;
	Integer id;
	User user;
	@Resource
	UserService userSerivce;
	@Resource
	ModuleURLService modlueURLService;
	@Override
	public String execute() throws Exception {
		user=userSerivce.findById(id);
		userPrivilegeList=modlueURLService.listUserPrivilege(user);
		return SUCCESS;
	}
	public List<UserPrivilege> getUserPrivilegeList() {
		return userPrivilegeList;
	}
	public void setUserPrivilegeList(List<UserPrivilege> userPrivilegeList) {
		this.userPrivilegeList = userPrivilegeList;
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
	public UserService getUserSerivce() {
		return userSerivce;
	}
	public void setUserSerivce(UserService userSerivce) {
		this.userSerivce = userSerivce;
	}
	public ModuleURLService getModlueURLService() {
		return modlueURLService;
	}
	public void setModlueURLService(ModuleURLService modlueURLService) {
		this.modlueURLService = modlueURLService;
	}
	

}
