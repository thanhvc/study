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

import rxb.crm.dao.DepartmentDao;
import rxb.crm.model.Department;
import rxb.crm.service.DepartmentService;

public class DefaultDepartmentServiceTest {
	static ApplicationContext ctx;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx=new ClassPathXmlApplicationContext("rxb/config/application.spring.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testCreateDepartment() {
		DepartmentService departmentService=ctx.getBean(DepartmentService.class);
		Department d=new Department();
	
		d.setAddress("青岛市");
		d.setCode("101");
		d.setName("总部");
		d.setTelephone("31561215");

		SessionFactory sf=(SessionFactory)ctx.getBean("sessionFactory");
		Session session=sf.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		departmentService.createDepartment(d);

		tx.commit();
	}
	@Test
	public void testUpdateDepartment() {
		DepartmentService departmentService=ctx.getBean(DepartmentService.class);
		Department d=new Department();
		
		d.setId(2);
		d.setAddress("青岛市");
		d.setCode("101");
		d.setName("总部");
		d.setTelephone("31561215");

		SessionFactory sf=(SessionFactory)ctx.getBean("sessionFactory");
		Session session=sf.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		departmentService.updateDepartment(d);

		tx.commit();
	}
//	@Test
//	public void testDeleteDepartment() {
//		DepartmentService departmentService=ctx.getBean(DepartmentService.class);
//		
//		Integer id=3;
//
//		SessionFactory sf=(SessionFactory)ctx.getBean("sessionFactory");
//		Session session=sf.getCurrentSession();
//		Transaction tx=session.beginTransaction();
//		
//		departmentService.deleteDepartment(id);
//
//		tx.commit();
//	}
//	@Test
//	public void testfindAll() {
//		DepartmentService departmentService=ctx.getBean(DepartmentService.class);
//		List<Department> ds=new ArrayList<>();
//
//		SessionFactory sf=(SessionFactory)ctx.getBean("sessionFactory");
//		Session session=sf.getCurrentSession();
//		Transaction tx=session.beginTransaction();
//		
//		ds=departmentService.findAll();
//		for(Department d:ds){
//			System.out.println(d.getName()+d.getId());
//		}
//
//		tx.commit();
//	}
	@Test
	public void testfindByKey() {
		DepartmentService departmentService=ctx.getBean(DepartmentService.class);
		List<Department> ds=new ArrayList<>();
		String key="青岛";

		SessionFactory sf=(SessionFactory)ctx.getBean("sessionFactory");
		Session session=sf.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		ds=departmentService.findByKey(key);
		for(Department d:ds){
			System.out.println(d.getName()+d.getId());
		}

		tx.commit();
	}


}
