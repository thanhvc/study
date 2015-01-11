package rxb.maven.user.web;

import javax.annotation.Resource;

import rxb.maven.model.User;
import rxb.maven.service.UserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CreateUserAction extends ActionSupport implements ModelDriven<User>{

	private static final long serialVersionUID = 1L;
	
	private User user;
	
	@Resource
	private UserService userService;
	
	@Override
	public String execute(){
		try {
			userService.createUser(user);
			return SUCCESS;			
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

	@Override
	public User getModel() {
		user=new User();
		return user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
