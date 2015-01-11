package rxb.crm.web.moduleurl;

import java.util.List;

import javax.annotation.Resource;

import rxb.crm.model.ModuleURL;
import rxb.crm.service.ModuleURLService;

import com.opensymphony.xwork2.ActionSupport;

public class ListModuleURLAction extends ActionSupport {
	List<ModuleURL> moduleURLList;
	@Resource
	ModuleURLService moduleURLService;
	@Override
	public String execute() throws Exception {
		moduleURLList=moduleURLService.findAll();
		return SUCCESS;
	}
	public List<ModuleURL> getModuleURLList() {
		return moduleURLList;
	}
	public void setModuleURLList(List<ModuleURL> moduleURLList) {
		this.moduleURLList = moduleURLList;
	}
	public ModuleURLService getModuleURLService() {
		return moduleURLService;
	}
	public void setModuleURLService(ModuleURLService moduleURLService) {
		this.moduleURLService = moduleURLService;
	}
	
}
