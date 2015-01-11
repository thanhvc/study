package rxb.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import rxb.crm.dao.ServiceDao;
import rxb.crm.model.Service;
import rxb.crm.service.ServiceService;

@org.springframework.stereotype.Service("serviceService")
public class DefaultServiceService implements ServiceService {
	@Resource
	ServiceDao serviceDao;
	
	@Override
	public void createService(Service s) {
		serviceDao.insertService(s);

	}

	@Override
	public void updateService(Service s) {
		serviceDao.updateService(s);

	}

	@Override
	public void deleteService(Integer id) {
		serviceDao.deleteService(id);

	}

	@Override
	public Service findById(Integer id) {
		return serviceDao.findById(id);
	}

	@Override
	public List<Service> findAll() {
		return serviceDao.findAll();			
	}

	@Override
	public List<Service> findByKey(String key) {
		return serviceDao.findByKey(key);
	}

}
