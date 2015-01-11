package rxb.crm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import rxb.crm.dao.SaleRecordDao;
import rxb.crm.model.SaleRecord;

@Component("saleRcordDao")
public class DefaultSaleRecordDao implements SaleRecordDao {
	SessionFactory sessionFactory;
	@Override
	public void insertSaleRecord(SaleRecord sr) {
		Session session=sessionFactory.getCurrentSession();
		session.save(sr);

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void updateSaleRecord(SaleRecord sr) {
		Session session=sessionFactory.getCurrentSession();
		session.update(sr);


	}

	@Override
	public void deleteSaleRecord(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		SaleRecord sr=(SaleRecord) session.get(SaleRecord.class, id);
		session.delete(sr);


	}

	@Override
	public SaleRecord findById(Integer id) {
		String hql="from SaleRecord where id=?";
		Session session =sessionFactory.getCurrentSession();
		Query q=session.createQuery(hql);
		q.setInteger(0, id);
		List rst=q.list();
		if(rst.size()>0)
		return (SaleRecord) rst.get(0);
		return null;
		
	}

	@Override
	public List<SaleRecord> findAll() {
		String hql="from SaleRecord";
		Session session =sessionFactory.getCurrentSession();
		Query q=session.createQuery(hql);
		List rst=q.list();
		return rst;
	}

	@Override
	public List<SaleRecord> findByKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
