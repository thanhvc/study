package rxb.crm.service.impl;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import rxb.crm.model.ModuleURL;
import rxb.crm.model.User;
import rxb.crm.model.UserPrivilege;
import rxb.crm.service.ModuleURLService;
import rxb.crm.service.UserPrivilegeService;
import rxb.crm.service.UserService;

public class DefaultUserPrivilegeServiceTest {
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
		UserService userService=ctx.getBean(UserService.class);
		ModuleURLService moduleURLService=ctx.getBean(ModuleURLService.class);
		UserPrivilegeService userPrivilegeService=ctx.getBean(UserPrivilegeService.class);
		UserPrivilege up=new UserPrivilege();
		
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		User user=userService.findById(14);
		ModuleURL mu=moduleURLService.findById(4);
		up.setUser(user);
		up.setModuleURL(mu);
		
		userPrivilegeService.createUserPrivilege(up);
		
		
	}

}
