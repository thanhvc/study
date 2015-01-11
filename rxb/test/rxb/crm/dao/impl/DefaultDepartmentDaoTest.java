package rxb.crm.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import rxb.crm.dao.DepartmentDao;


import rxb.crm.model.Department;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DefaultDepartmentDaoTest {

	static ApplicationContext ctx;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx=new ClassPathXmlApplicationContext("rxb/config/application.spring.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testInsertDepartment() {
		DepartmentDao departmentDao=(DepartmentDao)ctx.getBean(DepartmentDao.class);
		Department d=new Department();
	
		
		
		d.setAddress("青岛市");
		d.setCode("101");
		d.setName("总部");
		d.setTelephone("31561215");

		

		SessionFactory sf=(SessionFactory)ctx.getBean("sessionFactory");
		Session session=sf.getCurrentSession();
//		System.out.println(session);
		Transaction tx=session.beginTransaction();
		
		departmentDao.insertDepartment(d);
		
		tx.commit();
		
	//	assertNotNull();
	}
//	@Test
//	public void testDeleteDepartment(){
//		DepartmentDao departmentDao=(DepartmentDao) ctx.getBean(DepartmentDao.class);
//		Integer id=1;
//		
//		SessionFactory sessionFaction=(SessionFactory) ctx.getBean("sessionFactory");
//		Session session =sessionFaction.getCurrentSession();
//		Transaction tx=session.beginTransaction();
//		
//		departmentDao.deleteDepartment(id);
//		tx.commit();
//	}
	@Test
	public void testFindAll(){
		DepartmentDao departmentDao=ctx.getBean(DepartmentDao.class);
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		List<Department> rst=departmentDao.findAll();
		
		
		for(Department d:rst){
			System.out.println(d.getName());
		}
		tx.commit();
	}
	@Test
	public void testFindByKye(){
		DepartmentDao departmentDao=ctx.getBean(DepartmentDao.class);
		String key="青岛";
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		List<Department> rst=departmentDao.findByKey(key);
		
		
		for(Department d:rst){
			System.out.println(d.getName());
		}
		tx.commit();
	}
	@Test
	public void testFindId(){
		DepartmentDao departmentDao=ctx.getBean(DepartmentDao.class);
		Integer id=1;
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Department d=departmentDao.findById(id);
		
		System.out.print(d.getAddress());
	}

}
