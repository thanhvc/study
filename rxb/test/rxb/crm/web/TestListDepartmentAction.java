package rxb.crm.web;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import rxb.crm.web.department.ListDepartmentAction;

public class TestListDepartmentAction {

	static ApplicationContext ctx;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx=new ClassPathXmlApplicationContext("rxb/config/application.spring.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testExecute() {
		AbstractApplicationContext aac=(AbstractApplicationContext)ctx;
		ListDepartmentAction lda=(ListDepartmentAction)aac.getBeanFactory().createBean(ListDepartmentAction.class, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, false);
		SessionFactory sf=(SessionFactory)aac.getBean("sessionFactory");
		Session session=sf.getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			lda.execute();
			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tx.commit();
	}

}
