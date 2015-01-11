package rxb.crm.dao.impl;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import rxb.crm.dao.CustomerDao;
import rxb.crm.model.Customer;

public class DefaultCustomerDaoTest {
	static ApplicationContext ctx;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx=new ClassPathXmlApplicationContext("rxb/config/application.spring.xml");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Test
	public void testInsertCustomer() {
		CustomerDao customerDao =ctx.getBean(CustomerDao.class);
		
		Customer c=new Customer();
		c.setAddress("QingDao");
		c.setContactMan("Tom");
		c.setName("Jerry");
		c.setTelephone("34564552");
		c.setType("VIP");
		
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session =sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		customerDao.insertCustomer(c);
		
		tx.commit();
	}
//	@Test
//	public void testUpdateCustomer() {
//		CustomerDao customerDao =ctx.getBean(CustomerDao.class);
//		
//		Customer c=new Customer();
//		c.setId(1);
//		c.setAddress("QingDao");
//		c.setContactMan("Tom");
//		c.setName("Jerry");
//		c.setTelephone("34564552");
//		c.setType("VIP");
//		
//		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
//		Session session =sessionFactory.getCurrentSession();
//		Transaction tx=session.beginTransaction();
//		
//		customerDao.updateCustomer(c);
//		
//		tx.commit();
//	}
//	@Test
//	public void testDeleteCustomer() {
//		CustomerDao customerDao =ctx.getBean(CustomerDao.class);
//		
//		Integer id=1;
//		
//		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
//		Session session =sessionFactory.getCurrentSession();
//		Transaction tx=session.beginTransaction();
//		
//		customerDao.deleteCustomer(id);
//		
//		tx.commit();
//	}
	@Test
	public void testFindById() {
		CustomerDao customerDao =ctx.getBean(CustomerDao.class);
		
		Integer id=2;
		
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session =sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		Customer c=customerDao.findById(id);
		
		System.out.println(c.getName());
		
		tx.commit();
	}

}