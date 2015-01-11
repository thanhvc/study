package rxb.crm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import rxb.crm.dao.ModuleURLDao;
import rxb.crm.model.Module;
import rxb.crm.model.ModuleURL;
import rxb.crm.model.User;
import rxb.crm.model.UserPrivilege;

@Component("moduleURLDao")
public class DefaultModuleURLDao implements ModuleURLDao {
	SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void insertModuleURL(ModuleURL mp) {
		Session session=sessionFactory.getCurrentSession();
		session.save(mp);

	}

	@Override
	public void updateModuleURL(ModuleURL mp) {
		Session session=sessionFactory.getCurrentSession();
		session.update(mp);
	}

	@Override
	public void deleteModuleURL(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		ModuleURL p=(ModuleURL) session.get(ModuleURL.class,id);
		session.delete(p);

	}

	@Override
	public ModuleURL findById(Integer id) {
		String hql="from ModuleURL  where id=?";
		Session session =sessionFactory.getCurrentSession();
		Query q=session.createQuery(hql);
		q.setInteger(0, id);
		List rst=q.list();
		if(rst.size()>0){
			return (ModuleURL)rst.get(0);
		}
		return null;
	}

	@Override
	public List<ModuleURL> findAll() {
		String hql="from ModuleURL";
		Session session =sessionFactory.getCurrentSession();
		Query q=session.createQuery(hql);
		List rst=q.list();
		return rst;
	}

	@Override
	public List<UserPrivilege> listUserPrivilege(User u) {
		String hql="from UserPrivilege up where up.user.id=?";
		Session session =sessionFactory.getCurrentSession();
		Query q=session.createQuery(hql);
		q.setInteger(0, u.getId());
		List rst=q.list();
		return rst;
	}

	@Override
	public List<Module> listUserModule(User u) {
		String sql="select {m.*} from t_modules m "
				+ "inner join(select * from t_userprivileges where user_id=? ) u "
				+ "on (m.url_id=u.moduleurl_id)";
		Session session =sessionFactory.getCurrentSession();
		SQLQuery q=session.createSQLQuery(sql);
		q.addEntity("m",Module.class);
		q.setInteger(0, u.getId());
		List rst=q.list();
		
		return rst;
	}

	@Override
	public List findAll(Integer id) {
		 String sql="select {u.*},{p.*} from t_moduleurls u "
					+ "left join(select * from t_userprivileges where user_id=?) p on(p.moduleurl_id=u.id)";
		Session session =sessionFactory.getCurrentSession();
		SQLQuery q=session.createSQLQuery(sql);
		q.addEntity("u",ModuleURL.class);
		q.addEntity("p",UserPrivilege.class);
		q.setInteger(0, id);
		List rst=q.list();
		return rst;
	}

	@Override
	public List find(Integer id) {
		 String sql="select {u.*},{p.*} from t_users u "
					+ "left join(select * from t_userprivileges where moduleurl_id=?) p on(p.user_id=u.id)";

		Session session =sessionFactory.getCurrentSession();
		SQLQuery q=session.createSQLQuery(sql);
		q.addEntity("u",User.class);
		q.addEntity("p",UserPrivilege.class);
		q.setInteger(0, id);
		List rst=q.list();
		return rst;
	}

	@Override
	public Module loadRelativeModule(String actionName,String namespace) {
		String sql="select {m.*} from t_modules m inner join(select * from t_moduleurls where action=? and namespace=?) u on(u.module_id=m.id) ";
		Session session =sessionFactory.getCurrentSession();
		SQLQuery q=session.createSQLQuery(sql);
		q.addEntity("m",Module.class);
		q.setString(0, actionName);
		q.setString(1, namespace);
		List rst=q.list();
		if(rst.size()>0){
			return (Module) rst.get(0);
		}
		
		return null;
	}

	@Override
	public List<ModuleURL> loadRelativeModuleURL(Module m) {
		String sql="select {u.*} from t_moduleurls u inner join "
				+ "(select * from t_modules where id=? ) m "
				+ " on(u.module_id=m.id)";
		Session session =sessionFactory.getCurrentSession();
		SQLQuery q=session.createSQLQuery(sql);
		q.addEntity("u",ModuleURL.class);
		q.setInteger(0, m.getId());
		List rst=q.list();
		return rst;
	}


}
