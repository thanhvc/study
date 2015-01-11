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

import rxb.crm.model.User;
import rxb.crm.service.UserService;

public class DefaultUserServiceTest {
	static ApplicationContext ctx;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx=new ClassPathXmlApplicationContext("rxb/config/application.spring.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

//	@Test
//	public void testDeleteUsers() {
//		UserService userService =ctx.getBean(UserService.class);
//		
//		List<Integer> idList=new ArrayList<>();
//		idList.add(1);
//		idList.add(2);
//		 
//		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
//		Session session =sessionFactory.getCurrentSession();
//		Transaction tx=session.beginTransaction();
//		
//		userService.deleteUsers(idList);
//		
//		tx.commit();
//	}
	@Test
	public void testReset() {
		UserService userService =ctx.getBean(UserService.class);
		
		Integer id=14;
		 
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session =sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		userService.reset(id);
		
		tx.commit();
	}

}
