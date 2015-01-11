package rxb.crm.web.module;

import javax.annotation.Resource;

import rxb.crm.model.Module;
import rxb.crm.service.ModuleService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class LoadAction extends ActionSupport{
	Integer id;
	Module module;
	
	@Resource
	ModuleService moduleService;
	
	@Override
	public String execute() throws Exception {
		if(id!=null&&id>0){
			module=moduleService.findById(id);
		}else{
			module=new Module();
		}
		
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.push(module);
		return SUCCESS;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public void setModuleService(ModuleService moduleService) {
		this.moduleService = moduleService;
	}

}
