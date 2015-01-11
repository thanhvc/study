package rxb.crm.web.module;

import javax.annotation.Resource;

import org.apache.commons.logging.impl.Log4JLogger;
import org.logicalcobwebs.logging.impl.Log4jFactory;

import rxb.crm.model.Module;
import rxb.crm.service.ModuleService;
import rxb.system.WebUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CreateModuleAction extends ActionSupport implements ModelDriven<Module>{
	Module module;
	@Resource
	ModuleService moduleService;
	
	
	@Override
	public String execute() throws Exception {
		
		if(module.getId()!=null&&module.getId()>0){
			moduleService.update(module);
		}else{
			moduleService.create(module);
			WebUtil.removeModuleList();
		}
		return SUCCESS;
	}
	
	@Override
	public Module getModel() {
		module=new Module();
		return module;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public ModuleService getModuleService() {
		return moduleService;
	}

	public void setModuleService(ModuleService moduleService) {
		this.moduleService = moduleService;
	}
	

}
