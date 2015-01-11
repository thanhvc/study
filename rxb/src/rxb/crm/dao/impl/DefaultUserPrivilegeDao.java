package rxb.crm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import rxb.crm.dao.UserPrivilegeDao;
import rxb.crm.model.User;
import rxb.crm.model.UserPrivilege;

@Component("userPrivilegeDao")
public class DefaultUserPrivilegeDao implements UserPrivilegeDao {
	SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void insertUserPrivilege(UserPrivilege up) {
		Session session =sessionFactory.getCurrentSession();
		session.save(up);
		
	}

	@Override
	public void updateUserPrivilege(UserPrivilege up) {
		Session session =sessionFactory.getCurrentSession();
		session.update(up);
		
	}

	@Override
	public void deleteUserPrivilege(Integer id) {
		Session session =sessionFactory.getCurrentSession();
		UserPrivilege up=(UserPrivilege) session.get(UserPrivilege.class, id);
		session.delete(up);
	}

	@Override
	public UserPrivilege findById(Integer id) {
		String hql="from UserPrivilege where id=?";
		Session session =sessionFactory.getCurrentSession();
		Query q=session.createQuery(hql);
		q.setInteger(0, id);
		List rst=q.list();
		if(rst.size()>0){
			return (UserPrivilege) rst.get(0);
		}
		return null;
	}

	@Override
	public UserPrivilege findById(Integer uid, Integer mid) {
		String hql="from UserPrivilege up where up.user.id=? and up.moduleURL.id=?";
		Session session =sessionFactory.getCurrentSession();
		Query q=session.createQuery(hql);
		q.setInteger(0, uid);
		q.setInteger(1, mid);
		List rst=q.list();
		if(rst.size()>0){
			UserPrivilege up=(UserPrivilege) rst.get(0);
			return up;
		}
		return null;
	}

}
