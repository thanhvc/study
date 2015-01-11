package rxb.crm.web.moduleurl;

import javax.annotation.Resource;

import rxb.crm.model.ModuleURL;
import rxb.crm.service.ModuleURLService;
import rxb.system.WebUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CreateModuleURLAction extends ActionSupport implements ModelDriven<ModuleURL> {
	ModuleURL mu;
	@Resource
	ModuleURLService moduleURLService;
	
	@Override
	public String execute() throws Exception {
		if(mu.getId()!=null&&mu.getId()>0){
			moduleURLService.updateModuleURL(mu);
		}else{
			moduleURLService.createModuleURL(mu);
			WebUtil.removeModuleURLList();
		}
		return SUCCESS;
	}

	@Override
	public ModuleURL getModel() {
		mu=new ModuleURL();
		return mu;
	}

	public ModuleURL getMu() {
		return mu;
	}

	public void setMu(ModuleURL mu) {
		this.mu = mu;
	}

	public ModuleURLService getModuleURLService() {
		return moduleURLService;
	}

	public void setModuleURLService(ModuleURLService moduleURLService) {
		this.moduleURLService = moduleURLService;
	}
	
	

}
