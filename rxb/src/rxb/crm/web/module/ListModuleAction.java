package rxb.crm.web.module;

import java.util.List;

import javax.annotation.Resource;

import rxb.crm.model.Module;
import rxb.crm.service.ModuleService;

import com.opensymphony.xwork2.ActionSupport;

public class ListModuleAction extends ActionSupport {
	List<Module> moduleList;
	@Resource
	ModuleService moduleService;
	
	@Override
	public String execute() throws Exception {
		moduleList= moduleService.listModule();
		return SUCCESS;
	}

	public List<Module> getModuleList() {
		return moduleList;
	}

	public void setModuleList(List<Module> moduleList) {
		this.moduleList = moduleList;
	}

	public ModuleService getModuleService() {
		return moduleService;
	}

	public void setModuleService(ModuleService moduleService) {
		this.moduleService = moduleService;
	}
	
	
}
