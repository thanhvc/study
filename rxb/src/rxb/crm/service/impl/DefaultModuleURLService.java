
package rxb.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import rxb.crm.dao.ModuleURLDao;
import rxb.crm.model.Module;
import rxb.crm.model.ModuleURL;
import rxb.crm.model.User;
import rxb.crm.model.UserPrivilege;
import rxb.crm.service.ModuleURLService;
@Service("moduleURLService")
public class DefaultModuleURLService implements ModuleURLService {
	@Resource
	ModuleURLDao moduleURLDao;


	@Override
	public ModuleURL findById(Integer id) {
		return moduleURLDao.findById(id);
	}

	@Override
	public List<ModuleURL> findAll() {
		return moduleURLDao.findAll();
	}

	@Override
	public void createModuleURL(ModuleURL mu) {
		moduleURLDao.insertModuleURL(mu);
		
	}

	@Override
	public void updateModuleURL(ModuleURL mu) {
		moduleURLDao.updateModuleURL(mu);
		
	}

	@Override
	public void deleteModuleURL(Integer id) {
		moduleURLDao.deleteModuleURL(id);
		
	}

	@Override
	public List<UserPrivilege> listUserPrivilege(User u) {
		return moduleURLDao.listUserPrivilege(u);
	}

	@Override
	public List findAll(Integer id) {
		return moduleURLDao.findAll(id);
	}

	@Override
	public List find(Integer id) {
		return moduleURLDao.find(id);
	}

	@Override
	public List<Module> listUserModule(User u) {
		return moduleURLDao.listUserModule(u);
	}

	@Override
	public Module loadRelativeModule(String actionName,String namespace) {
		return moduleURLDao.loadRelativeModule(actionName,namespace);
	}

	@Override
	public List<ModuleURL> loadRelativeModuleURL(Module m) {
		return moduleURLDao.loadRelativeModuleURL(m);
	}

}