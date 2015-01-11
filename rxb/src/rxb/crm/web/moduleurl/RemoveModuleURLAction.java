package rxb.crm.web.moduleurl;

import javax.annotation.Resource;

import rxb.crm.model.ModuleURL;
import rxb.crm.service.ModuleURLService;
import rxb.system.WebUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RemoveModuleURLAction extends ActionSupport implements ModelDriven<ModuleURL> {
	ModuleURL moduleURL;
	@Resource
	ModuleURLService moduleURLService;
	
	@Override
	public String execute() throws Exception {
		Integer id=moduleURL.getId();
		moduleURLService.deleteModuleURL(id);
		WebUtil.removeModuleURLList();
		return SUCCESS;
	}

	public ModuleURL getModuleURL() {
		return moduleURL;
	}

	public void setModuleURL(ModuleURL moduleURL) {
		this.moduleURL = moduleURL;
	}

	public ModuleURLService getModuleURLService() {
		return moduleURLService;
	}

	public void setModuleURLService(ModuleURLService moduleURLService) {
		this.moduleURLService = moduleURLService;
	}

	@Override
	public ModuleURL getModel() {
		moduleURL=new ModuleURL();
		return moduleURL;
	}

}
