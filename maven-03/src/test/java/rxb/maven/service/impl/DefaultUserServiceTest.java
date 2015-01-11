package rxb.maven.service.impl;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import rxb.maven.model.User;
import rxb.maven.service.UserService;

public class DefaultUserServiceTest {
	static ApplicationContext context;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context=new ClassPathXmlApplicationContext("application.spring.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Test
	public void test() {
		UserService userService=context.getBean(UserService.class);
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		User user=new User();
		user.setUsername("123456");
		userService.createUser(user);
		
		tx.commit();
	}

}
