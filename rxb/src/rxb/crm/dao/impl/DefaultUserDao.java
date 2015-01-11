package rxb.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import rxb.crm.dao.UserDao;
import rxb.crm.model.User;

@Component("userDao")
public class DefaultUserDao implements UserDao {
	SessionFactory sessionFactory;
	@Override
	public void insertUser(User u) {
		Session session=sessionFactory.getCurrentSession();
		session.save(u);
	}

	@Override
	public void updateUser(User u) {
		Session session=sessionFactory.getCurrentSession();
		session.update(u);

	}

	@Override
	public void deleteUser(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		User u=(User) session.get(User.class, id);
		session.delete(u);

	}

	@Override
	public List<User> findAll() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from User ";
		Query q=session.createQuery(hql);
		return q.list();
	}

	@Override
	public User findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from User u where u.id=?";
		Query q=session.createQuery(hql);
		q.setInteger(0, id);
		return (User) q.list().get(0);
	}

	@Override
	public List<User> findByKey(String key) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public User find(String username) {
		//String hql ="from User u where u.username=?";
		Session session =sessionFactory.getCurrentSession();
		/*Query q=session.createQuery(hql);
		q.setString(0, username);
		List<User> us=q.list();*/
		Criteria criteria=session.createCriteria(User.class);
		System.out.println(username);
		criteria.add(Restrictions.eq("username", username));
		List<User> us=criteria.list();
		if(us.size()>0)return (User) us.get(0);
		return null;
	}

	@Override
	public void deleteUsers(List<Integer> idList) {
		for(int i=0;i<idList.size();i++){
			
			Session session=sessionFactory.getCurrentSession();
			User u=(User) session.get(User.class, idList.get(i));
			
			session.delete(u);
		}
	}

	@Override
	public void reset(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		User u=(User) session.get(User.class, id);
		u.setPassword("123456");
		
		session.update(u);
	}

	@Override
	public void status(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		User u=(User) session.get(User.class, id);
		if(u.getStatus()=='0'){
			u.setStatus('1');
		}else{
			u.setStatus('0');
		}
		
		session.update(u);
		
	}

	@Override
	public void resetUsers(List<Integer> idList) {
			for(int i=0;i<idList.size();i++){
			
			Session session=sessionFactory.getCurrentSession();
			User u=(User) session.get(User.class, idList.get(i));
			u.setPassword("123456");
			
			session.update(u);
		}
		
	}

	@Override
	public void statusUsers(List<Integer> idList) {
		for(int i=0;i<idList.size();i++){
			
			Session session=sessionFactory.getCurrentSession();
			User u=(User) session.get(User.class, idList.get(i));
			if(u.getStatus()=='0'){
				u.setStatus('1');
			}else{
				u.setStatus('0');
			}
			
			session.update(u);
		}
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
