package rxb.crm.web.customer;

import javax.annotation.Resource;

import rxb.crm.model.Customer;
import rxb.crm.service.CustomerService;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerDetailAction extends ActionSupport {
	Customer customer;
	Integer id;
	@Resource
	CustomerService customerService;
	
	@Override
	public String execute() throws Exception {
		try{
			customer=customerService.findById(id);
			
		}catch(Exception e){
			e.printStackTrace();
		}
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

}
