package rxb.crm.web.customer;

import javax.annotation.Resource;

import rxb.crm.model.Customer;
import rxb.crm.service.CustomerService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class LoadAction extends ActionSupport {
	Integer id;
	Customer customer;
	@Resource
	CustomerService customerService;
	@Override
	public String execute() throws Exception {
		if(id!=null&&id>0){
			customer=customerService.findById(id);
		}else{
			customer =new Customer();
		}
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.push(customer);
		
		return SUCCESS;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public CustomerService getCustomerService() {
		return customerService;
	}
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
}
