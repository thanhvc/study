package rxb.crm.service;

import java.util.List;

import rxb.crm.model.Service;

public interface ServiceService {
	public void createService(Service s);
	public void updateService(Service s);
	public void deleteService(Integer id);
	public Service findById(Integer id);
	public List<Service> findAll();
	public List<Service> findByKey(String key);
}
