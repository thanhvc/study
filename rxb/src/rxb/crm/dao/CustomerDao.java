package rxb.crm.dao;

import java.util.List;

import rxb.crm.model.Customer;

public interface CustomerDao {
	public void insertCustomer(Customer c);
	public void updateCustomer(Customer c);
	public void deleteCustomer(Integer id);
	public Customer findById(Integer id);
	public List<Customer> findAll();
	public List<Customer> findByKey(String key);
}
