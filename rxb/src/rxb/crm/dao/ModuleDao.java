package rxb.crm.dao;

import java.util.List;

import rxb.crm.model.Module;

public interface ModuleDao {
	public void insert(Module m);
	public void update(Module m);
	public void delete(Integer id);
	public List<Module> listModule();
	public Module findById(Integer id);
	
}
