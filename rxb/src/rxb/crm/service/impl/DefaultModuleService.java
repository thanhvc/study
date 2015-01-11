package rxb.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import rxb.crm.dao.ModuleDao;
import rxb.crm.model.Module;
import rxb.crm.service.ModuleService;

@Service("moduleService")
public class DefaultModuleService implements ModuleService {
	@Resource
	ModuleDao moduleDao;

	@Override
	public void create(Module m) {
		moduleDao.insert(m);

	}

	@Override
	public void update(Module m) {
		moduleDao.update(m);

	}

	@Override
	public void remove(Integer id) {
		moduleDao.delete(id);

	}

	public ModuleDao getModuleDao() {
		return moduleDao;
	}

	public void setModuleDao(ModuleDao moduleDao) {
		this.moduleDao = moduleDao;
	}

	@Override
	public Module findById(Integer id) {
		return moduleDao.findById(id);
	}

	@Override
	public List<Module> listModule() {
		return moduleDao.listModule();
	}

	

}
