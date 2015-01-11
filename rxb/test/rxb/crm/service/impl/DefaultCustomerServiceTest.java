package rxb.crm.service.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
import rxb.crm.service.CustomerService;

public class DefaultCustomerServiceTest {
	static ApplicationContext ctx;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx=new ClassPathXmlApplicationContext("rxb/config/application.spring.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testCreateCustomer() {
		CustomerService customerService =ctx.getBean(CustomerService.class);
		
		Customer c=new Customer();
		c.setAddress("QingDao");
		c.setContactMan("Tom");
		c.setName("Jerry");
		c.setTelephone("34564552");
		c.setType("VIP");
		
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session =sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		customerService.createCustomer(c);
		
		tx.commit();
	}
		@Test
		public void testUpdateCustomer() {
			CustomerService customerService =ctx.getBean(CustomerService.class);
			
			Customer c=new Customer();
			c.setId(2);
			c.setAddress("QingDao");
			c.setContactMan("Tom");
			c.setName("Jerry");
			c.setTelephone("34564552");
			c.setType("VIP");
			
			SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
			Session session =sessionFactory.getCurrentSession();
			Transaction tx=session.beginTransaction();
			
			customerService.updateCustomer(c);
			
			tx.commit();
	}
		@Test
		public void findByKey() {
			CustomerService customerService =ctx.getBean(CustomerService.class);
			
			String key="QingDao";
			List<Customer> cs=new ArrayList<>();
			
			SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
			Session session =sessionFactory.getCurrentSession();
			Transaction tx=session.beginTransaction();
			
			cs=customerService.findByKey(key);
			
			for(Customer c:cs ){
				System.out.println(c.getName());
			}
			
			tx.commit();
	}

}
