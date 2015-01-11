package rxb.crm.dao;

import java.util.List;

import rxb.crm.model.Module;
import rxb.crm.model.ModuleURL;
import rxb.crm.model.User;
import rxb.crm.model.UserPrivilege;

public interface ModuleURLDao {
	public void insertModuleURL(ModuleURL mu);
	public void updateModuleURL(ModuleURL mu);
	public void deleteModuleURL(Integer id);
	public ModuleURL findById(Integer id);
	public List<ModuleURL> findAll();
	public List findAll(Integer id);
	public List find(Integer id);
	public List<Module> listUserModule(User u);
	public List<UserPrivilege> listUserPrivilege(User u);
	public Module loadRelativeModule(String actionName,String namespce);
	public List<ModuleURL> loadRelativeModuleURL(Module m);
}