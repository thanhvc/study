package rxb.maven.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import rxb.maven.dao.UserDao;
import rxb.maven.model.User;

@Component("userDao")
public class DefaultUserDao implements UserDao {
	private SessionFactory sessionFactory;

	@Override
	public boolean createUser(User user) {
		Session session=sessionFactory.getCurrentSession();
		try {
			session.save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteUserById(Integer id) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.delete(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
