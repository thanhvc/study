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

import rxb.crm.dao.ModuleURLDao;
import rxb.crm.dao.UserDao;
import rxb.crm.dao.UserPrivilegeDao;
import rxb.crm.model.ModuleURL;
import rxb.crm.model.User;
import rxb.crm.model.UserPrivilege;


public class DefaultUserPrivilegeDaoTest {
	static ApplicationContext ctx;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx=new ClassPathXmlApplicationContext("rxb/config/application.spring.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testCreateUserPrivilege() {
		UserDao userDao=ctx.getBean(UserDao.class);
		ModuleURLDao moduleURLDao=ctx.getBean(ModuleURLDao.class);
		UserPrivilegeDao userPrivilegeDao=ctx.getBean(UserPrivilegeDao.class);
		UserPrivilege up=new UserPrivilege();
		
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		User user=userDao.findById(2);
		ModuleURL mu=moduleURLDao.findById(2);
		up.setUser(user);
		up.setModuleURL(mu);
		up.setMask('1');
		
		userPrivilegeDao.insertUserPrivilege(up);
		
		
		tx.commit();
		
		
	}
}