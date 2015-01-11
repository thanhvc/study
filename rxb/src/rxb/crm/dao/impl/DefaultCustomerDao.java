package rxb.crm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import rxb.crm.dao.CustomerDao;
import rxb.crm.model.Customer;

@Component("customerDao")
public class DefaultCustomerDao implements CustomerDao {
	SessionFactory sessionFactory;
	@Override
	public void insertCustomer(Customer c) {
		Session session =sessionFactory.getCurrentSession();
		session.save(c);

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void updateCustomer(Customer c) {
		Session session =sessionFactory.getCurrentSession();
		session.update(c);

	}

	@Override
	public void deleteCustomer(Integer id) {
		Session session =sessionFactory.getCurrentSession();
		Customer c=(Customer) session.get(Customer.class, id);
		session.delete(c);

	}

	@Override
	public Customer findById(Integer id) {
		String hql ="from Customer where id=?";
		Session session =sessionFactory.getCurrentSession();
		Query q=session.createQuery(hql);
		q.setInteger(0, id);
		List rst=q.list();
		if(rst.size()>0)
		return (Customer)rst.get(0);
		return null;
	}

	@Override
	public List<Customer> findAll() {
		String hql ="from Customer";
		Session session =sessionFactory.getCurrentSession();
		Query q=session.createQuery(hql);
		List rst=q.list();
		return rst;
	}

	@Override
	public List<Customer> findByKey(String key) {
		String hql ="from Customer c where c.address||c.contactMan like ?";
		Session session =sessionFactory.getCurrentSession();
		Query q=session.createQuery(hql);
		q.setString(0, "%"+key+"%");
		List rst=q.list();
		return rst;
		
	}

}
