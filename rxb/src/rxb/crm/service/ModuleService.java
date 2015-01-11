package rxb.crm.service;

import java.util.List;

import rxb.crm.model.Module;

public interface ModuleService {
	public void create(Module m);
	public void update(Module m);
	public void remove(Integer id);
	public Module findById(Integer id);
	public List<Module> listModule();
	

}
