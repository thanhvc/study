package rxb.crm.dao;

import java.util.List;

import rxb.crm.model.Service;

public interface ServiceDao {
	public void insertService(Service s);
	public void updateService(Service s);
	public void deleteService(Integer id);
	public Service findById(Integer id);
	public List<Service> findAll();
	public List<Service> findByKey(String key);

}
