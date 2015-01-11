package rxb.crm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import rxb.crm.dao.ModuleDao;
import rxb.crm.model.Module;
import rxb.crm.model.User;

@Component("moduleDao")
public class DefaultModuleDao implements ModuleDao {
	SessionFactory sessionFactory;
	@Override
	public void insert(Module m) {
		Session session =sessionFactory.getCurrentSession();
		session.save(m);

	}

	@Override
	public void update(Module m) {
		Session session =sessionFactory.getCurrentSession();
		session.update(m);

	}

	@Override
	public void delete(Integer id) {
		Session session =sessionFactory.getCurrentSession();
		Module m=(Module) session.get(Module.class, id);
		session.delete(m);

	}


	@Override
	public List<Module> listModule() {
		String hql="from Module";
		Session session =sessionFactory.getCurrentSession();
		Query q=session.createQuery(hql);
		
		List rst=q.list();
		return rst;
	}

	@Override
	public Module findById(Integer id) {
		String hql="from Module where id=?";
		Session session=sessionFactory.getCurrentSession();
		Query q=session.createQuery(hql);
		q.setInteger(0, id);
		List rst=q.list();
		if(rst.size()>0){
			return (Module) rst.get(0);
		}
		return null;
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
