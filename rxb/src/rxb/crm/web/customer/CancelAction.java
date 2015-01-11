package rxb.crm.web.customer;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CancelAction extends ActionSupport {
	Map<String ,Object> session =ActionContext.getContext().getSession();
	@Override
	public String execute() throws Exception {
		System.out.println("**********************************************");
		session.remove("CUSTOMERS");
		return SUCCESS;
	}

}
