package rxb.crm.service.impl;

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



import rxb.crm.model.Product;
import rxb.crm.service.ProductService;

public class DefaultProductServiceTest {
	static ApplicationContext ctx;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx=new ClassPathXmlApplicationContext("rxb/config/application.spring.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testCreateProduct() {
		ProductService productService=ctx.getBean(ProductService.class);
		
		Product p=new Product();
		p.setFactory("factory1");
		p.setModel("0");
		p.setName("product1");
		p.setPrice(new BigDecimal(12.3));
		
		SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
		Session session =sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		productService.createProduct(p);
		
		tx.commit();
	}

}
