package rxb.crm.dao.impl;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import rxb.crm.dao.ServiceDao;
import rxb.crm.model.Service;

public class DefaultServiceDaoTest {
	static ApplicationContext ctx;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx=new ClassPathXmlApplicationContext("rxb/config/application.spring.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testInsertService() {
		ServiceDao serviceDao=ctx.getBean(ServiceDao.class);
		
		Service s=new Service();
		s.setContent("服务1");
		s.setInterval(10);
		s.setName("service1");
		s.setPrice(new BigDecimal(12.3));
		
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session =sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		serviceDao.insertService(s);
		
		tx.commit();
		
	}
	@Test
	public void testUpdateService() {
		ServiceDao serviceDao=ctx.getBean(ServiceDao.class);
		
		Service s=new Service();
		s.setId(1);
		s.setContent("服务1");
		s.setInterval(10);
		s.setName("service1");
		s.setPrice(new BigDecimal(12.3));
		
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session =sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		serviceDao.updateService(s);
		
		tx.commit();
	}

	@Test
	public void testDeleteService() {
		ServiceDao serviceDao=ctx.getBean(ServiceDao.class);
		
		Integer id=1;
		
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session =sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		serviceDao.deleteService(id);
		
		tx.commit();
	}



}
