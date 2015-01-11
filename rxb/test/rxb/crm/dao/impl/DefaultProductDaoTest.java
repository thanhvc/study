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

import rxb.crm.dao.ProductDao;
import rxb.crm.model.Product;

public class DefaultProductDaoTest {
	static ApplicationContext ctx;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx=new ClassPathXmlApplicationContext("rxb/config/application.spring.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testInsertProduct() {
		ProductDao productDao=ctx.getBean(ProductDao.class);
		
		Product p=new Product();
		p.setFactory("factory1");
		p.setModel("0");
		p.setName("product1");
		p.setPrice(new BigDecimal(12.3));
		
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session =sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		productDao.insertProduct(p);
		
		tx.commit();
	}

	@Test
	public void testUpdateProduct() {
		ProductDao productDao=ctx.getBean(ProductDao.class);
		
		Product p=new Product();
		p.setId(1);
		p.setFactory("factory1");
		p.setModel("0");
		p.setName("product1");
		p.setPrice(new BigDecimal(12.3));
		
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session =sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		productDao.updateProduct(p);
		
		tx.commit();
	}

	@Test
	public void testDeleteProduct() {
		ProductDao productDao=ctx.getBean(ProductDao.class);
		
		Integer id=1;
		
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session =sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		productDao.deleteProduct(id);
		
		tx.commit();
	}

}
