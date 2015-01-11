package rxb.crm.service;

import java.util.List;

import rxb.crm.model.Customer;

public interface CustomerService {
	public void createCustomer(Customer c);
	public void updateCustomer(Customer c);
	public void deleteCustomer(Integer id);
	public Customer findById(Integer id);
	public List<Customer> findAll();
	public List<Customer> findByKey(String key);
}
