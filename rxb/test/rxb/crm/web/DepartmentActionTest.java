package rxb.crm.web;

import static org.junit.Assert.*;

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

import rxb.crm.model.Department;
import rxb.crm.web.department.DepartmentAction;

public class DepartmentActionTest {

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
		DepartmentAction da=(DepartmentAction)aac.getBeanFactory().createBean(DepartmentAction.class, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, false);
		SessionFactory sf=(SessionFactory)aac.getBean("sessionFactory");
		Session session=sf.getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			Department d=new Department();
			//d.setId(2);
			d.setAddress("qingdao");
			
			da.setDepartment(d);
			
			da.execute();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
