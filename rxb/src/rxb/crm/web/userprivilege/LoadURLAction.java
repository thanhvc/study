package rxb.crm.web.userprivilege;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import rxb.crm.model.ModuleURL;
import rxb.crm.service.ModuleURLService;
import rxb.crm.service.UserPrivilegeService;

public class LoadURLAction extends ActionSupport{
	Integer id;
	ModuleURL moduleURL;
	List list;
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
		list=moduleURLService.find(id);
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

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
}
