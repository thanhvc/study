package rxb.crm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import rxb.crm.dao.ServiceDao;
import rxb.crm.model.Service;

@Component("serviceDao")
public class DefaultServiceDao implements ServiceDao {
	SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void insertService(Service s) {
		Session session=sessionFactory.getCurrentSession();
		session.save(s);

	}

	@Override
	public void updateService(Service s) {
		Session session=sessionFactory.getCurrentSession();
		session.update(s);

	}

	@Override
	public void deleteService(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Service s=(Service) session.get(Service.class, id);
		session.delete(s);

	}

	@Override
	public Service findById(Integer id) {
		String hql="from Service where id=?";
		Session session =sessionFactory.getCurrentSession();
		Query q=session.createQuery(hql);
		q.setInteger(0, id);
		return (Service) q.list().get(0);
	}

	@Override
	public List<Service> findAll() {
		String hql="from Service ";
		Session session =sessionFactory.getCurrentSession();
		Query q=session.createQuery(hql);
		
		return  q.list();
	}

	@Override
	public List<Service> findByKey(String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
