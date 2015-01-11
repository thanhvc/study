package rxb.crm.web.user;

import javax.annotation.Resource;

import rxb.crm.model.User;
import rxb.crm.service.UserService;
import rxb.system.WebUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	User user;
	String repassword;
	@Resource
	UserService userService;
	
	@Override
	public void validate() {
		if(user.getUsername()==null||user.getUsername().trim().length()==0){
			this.addFieldError("username", "�û�������Ϊ��");
		}else if(!(repassword.equals(user.getPassword()))){
			this.addFieldError("repassword", "�����������벻��ͬ������������");
		}else if(user.getPassword()==null||user.getPassword().trim().length()<6){
			this.addFieldError("password", "��������������ַ�����");
		}
	}
	
	@Override
	public String execute() throws Exception {
		try{
			if(user.getId()!=null&&user.getId()>0){
				userService.updateUser(user);
			}else{
				userService.createUser(user);
				WebUtil.removeUserList();
			}
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			this.addActionError(e.getMessage());
			return INPUT;
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

	public UserService getUserService() {
		return userService;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}



}
