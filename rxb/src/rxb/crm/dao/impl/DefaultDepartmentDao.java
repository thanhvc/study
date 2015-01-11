package rxb.crm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import rxb.crm.dao.DepartmentDao;
import rxb.crm.model.Department;

@Component("departmentDao")
public class DefaultDepartmentDao implements DepartmentDao {
	SessionFactory sessionFactory;
	@Override
	public void insertDepartment(Department d) {
		Session session =sessionFactory.getCurrentSession();
		session.save(d);
		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void updateDepartment(Department d) {
		Session session =sessionFactory.getCurrentSession();
		session.update(d);
		
	}

	@Override
	public void deleteDepartment(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Department d=(Department) session.get(Department.class, id);
		session.delete(d);
		
	}

	@Override
	public Department findById(Integer id) {
		Session session =sessionFactory.getCurrentSession();
		String hql="from Department d where d.id=?";
		Query q=session.createQuery(hql);
		q.setInteger(0, id);
		List rst=q.list();
		if(rst.size()>0){
			return (Department) rst.get(0);
		}
		return null;
	}

	@Override
	public List<Department> findAll() {
		Session session =sessionFactory.getCurrentSession();
		String hql="from Department";
		Query q=session.createQuery(hql);
		List rst=q.list();
		return rst;
	}

	@Override
	public List<Department> findByKey(String key) {
		Session session =sessionFactory.getCurrentSession();
		String hql="from Department d where d.code||d.address||d.manager||d.name||d.telephone like ?";
		
		Query q=session.createQuery(hql);
		q.setString(0, "%"+key+"%");
		List rst=q.list();
		return rst;
	}



}
