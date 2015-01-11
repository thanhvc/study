package rxb.crm.web.customer;

import javax.annotation.Resource;

import rxb.crm.model.Customer;
import rxb.crm.service.CustomerService;
import rxb.system.WebUtil;

import com.opensymphony.xwork2.ActionSupport;

public class RemoveCustomerAction extends ActionSupport {
	Customer customer;
	@Resource
	CustomerService customerService;
	
	@Override
	public String execute() throws Exception {
		customerService.deleteCustomer(customer.getId());
		WebUtil.removeCustomerList();
		return SUCCESS;
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
