package rxb.crm.web.customer;

import java.util.List;

import javax.annotation.Resource;

import rxb.crm.model.Customer;
import rxb.crm.service.CustomerService;

import com.opensymphony.xwork2.ActionSupport;

public class ListCustomerAction extends ActionSupport {
	List<Customer> customerList;
	@Resource
	CustomerService customerService;
	
	@Override
	public String execute() throws Exception {
		customerList=customerService.findAll();
		return SUCCESS;
	}
	
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	public CustomerService getCustomerService() {
		return customerService;
	}	

}
