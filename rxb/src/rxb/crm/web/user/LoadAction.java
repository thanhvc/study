package rxb.crm.web.user;

import javax.annotation.Resource;

import rxb.crm.model.User;
import rxb.crm.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class LoadAction extends ActionSupport {
	Integer id;
	User user;
	
	@Resource
	UserService userservice;
	
	public String execute(){
		
		if(id!=null&&id>0){
			user=userservice.findById(id);
		}else{
			user=new User();
		}
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



	public UserService getUserservice() {
		return userservice;
	}

}
