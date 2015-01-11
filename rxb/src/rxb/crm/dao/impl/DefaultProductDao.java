package rxb.crm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import rxb.crm.dao.ProductDao;
import rxb.crm.model.Product;

@Component("productDao")
public class DefaultProductDao implements ProductDao {
	SessionFactory sessionFactory;
	@Override
	public void insertProduct(Product p) {
		Session session=sessionFactory.getCurrentSession();
		session.save(p);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void updateProduct(Product p) {
		Session session=sessionFactory.getCurrentSession();
		session.update(p);

	}

	@Override
	public void deleteProduct(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Product p=(Product) session.get(Product.class, id);
		session.delete(p);

	}

	@Override
	public Product findById(Integer id) {
		Session session =sessionFactory.getCurrentSession();
		String hql="from Product p where p.id=?";
		Query q=session.createQuery(hql);
		q.setInteger(0, id);
		List rst=q.list();
		if(rst.size()>0)
		return (Product) rst.get(0);
		return null;
	}

	@Override
	public List<Product> findAll() {
		Session session =sessionFactory.getCurrentSession();
		String hql="from Product";
		Query q=session.createQuery(hql);
		List rst=q.list();
		return rst;
	}

	@Override
	public List<Product> findByKey(String key) {
		Session session =sessionFactory.getCurrentSession();
		String hql="from Product p where p.description||p.factory||p.model||p.name like ?";
		Query q=session.createQuery(hql);
		q.setString(0, "%"+key+"%");
		List rst=q.list();
		return rst;
	}

}
