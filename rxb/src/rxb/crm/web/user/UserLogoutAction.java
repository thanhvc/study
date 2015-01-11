package rxb.crm.web.user;

import com.opensymphony.xwork2.ActionSupport;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class UserLogoutAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		HttpSession session=ServletActionContext.getRequest().getSession();
		if(session!=null){
			session.invalidate();
		}
		return SUCCESS;
	}

}
