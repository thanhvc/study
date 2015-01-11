package rxb.crm.dao.impl;

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

import rxb.crm.dao.UserDao;
import rxb.crm.model.User;

public class DefaultUserDaoTest {
	static ApplicationContext ctx;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx=new ClassPathXmlApplicationContext("rxb/config/application.spring.xml");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testInsertUser() {
		UserDao userDao=ctx.getBean(UserDao.class);
		User user=new User();
		
		user.setEmail("1561@email.com");
		user.setPassword("111111");
		user.setRealname("Àî°×");
		user.setStatus('0');
		user.setTelephone("56425864");
		user.setUsername("Tom1");
		
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		userDao.insertUser(user);
		
		tx.commit();
	}
	@Test
	public void testDeleteUser(){
		UserDao userDao=ctx.getBean(UserDao.class);
		Integer id=1100;
		
		SessionFactory sessionFactory =(SessionFactory) ctx.getBean("sessionFactory");
		Session session =sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		userDao.deleteUser(id);
		
		tx.commit();
	}
	@Test
	public void testUpdateUser(){
		UserDao userDao =ctx.getBean(UserDao.class);
		User user=new User();
		
		user.setId(6);
		user.setPassword("123456");
		
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session =sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		userDao.updateUser(user);
		
		tx.commit();
	}
//	@Test
//	public void testFindById(){
//		UserDao userDao =ctx.getBean(UserDao.class);
//		
//		Integer id=2;
//		
//		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
//		Session session =sessionFactory.getCurrentSession();
//		Transaction tx=session.beginTransaction();
//		
//		User u=userDao.findById(id);
//		System.out.println(u.getPassword());
//		
//		tx.commit();
//	}
//	@Test
//	public void testFind(){
//		UserDao userDao =ctx.getBean(UserDao.class);
//		
//		String username="user123";
//		
//		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
//		Session session =sessionFactory.getCurrentSession();
//		Transaction tx=session.beginTransaction();
//		
//		User u=userDao.find(username);
//		System.out.println(u.getPassword());
//		
//		tx.commit();
//	}
	@Test
	public void testDeleteUsers(){
		UserDao userDao =ctx.getBean(UserDao.class);
		
		List<Integer> idList=new ArrayList<>();
		idList.add(2);
		idList.add(3)
		;
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session =sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		userDao.deleteUsers(idList);
		
		tx.commit();
	}
	
	@Test
	public void find(){
		UserDao userDao =ctx.getBean(UserDao.class);
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session =sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		User user=userDao.find("tom");
		System.out.println(user);
		tx.commit();		
	}
}
