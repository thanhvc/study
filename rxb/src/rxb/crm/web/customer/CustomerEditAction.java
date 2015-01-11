package rxb.crm.web.customer;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import rxb.crm.model.Customer;
import rxb.crm.service.CustomerService;
import rxb.system.WebUtil;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerEditAction extends ActionSupport implements ModelDriven<Customer> {
	Customer customer;
	@Resource
	CustomerService customerService;
	
	Map<String,Object> session=ActionContext.getContext().getSession();
	
	@Override
	public String execute() throws Exception {
		if(customer.getId()!=null&&customer.getId()>0){
			customerService.updateCustomer(customer);
		}else{
			customerService.createCustomer(customer);
			WebUtil.removeCustomerList();
		}
		return SUCCESS;
	}
	
	public String importCustomer() throws Exception{
	
		List<Customer> customerList=(List<Customer>) session.get("CUSTOMERS");
		if(customerList!=null&&customerList.size()>0){
			for(int i=0;i<customerList.size();i++){
				Customer c=customerList.get(i);
				customerService.createCustomer(c);
				WebUtil.removeCustomerList();
			}
		}
		session.remove("CUSTOMERS");
		return SUCCESS;
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
	@Override
	public Customer getModel() {
		customer=new Customer();
		return customer;
	}
	
}
