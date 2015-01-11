package rxb.crm.web.moduleurl;

import javax.annotation.Resource;

import rxb.crm.model.ModuleURL;
import rxb.crm.service.ModuleURLService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class LoadAction extends ActionSupport {
	Integer id;
	ModuleURL moduleURL;

	@Resource
	ModuleURLService moduleURLService;
	
	@Override
	public String execute() throws Exception {
		if(id!=null&&id>0){
			moduleURL=moduleURLService.findById(id);
			
		}else{
			moduleURL=new ModuleURL();
		}
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.push(moduleURL);
		return SUCCESS;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	
}
