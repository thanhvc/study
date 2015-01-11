package rxb.crm.web.user;

import java.util.List;






import javax.annotation.Resource;

import rxb.crm.model.User;
import rxb.crm.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class ListUserAction extends ActionSupport {
	List<User> userList;
	@Resource
	UserService userService;
	
	@Override
	public String execute() throws Exception {
		userList=userService.findAll();
		return SUCCESS;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	

}
