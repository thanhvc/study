package rxb.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import rxb.crm.dao.CustomerDao;
import rxb.crm.model.Customer;
import rxb.crm.service.CustomerService;

@Service("customerService")
public class DefaultCustomerService implements CustomerService {
	@Resource
	CustomerDao customerDao;

	@Override
	public void createCustomer(Customer c) {
		customerDao.insertCustomer(c);

	}

	@Override
	public void updateCustomer(Customer c) {
		customerDao.updateCustomer(c);

	}

	@Override
	public void deleteCustomer(Integer id) {
		customerDao.deleteCustomer(id);

	}

	@Override
	public Customer findById(Integer id) {
		return customerDao.findById(id);
	}

	@Override
	public List<Customer> findAll() {
		return customerDao.findAll();
	}

	@Override
	public List<Customer> findByKey(String key) {
		return customerDao.findByKey(key);
	}

}
