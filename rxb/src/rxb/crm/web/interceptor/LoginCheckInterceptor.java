package rxb.crm.web.interceptor;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import rxb.crm.exception.AccessDeniedException;
import rxb.crm.model.Module;
import rxb.crm.model.ModuleURL;
import rxb.crm.model.UserPrivilege;
import rxb.crm.service.ModuleURLService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginCheckInterceptor extends AbstractInterceptor {
	String[] allowAction={"//uloginform","//ulogin"};
	
	@Resource
	ModuleURLService moduleURLService;
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		Map<String,Object> session =arg0.getInvocationContext().getSession();
		ActionProxy actionProxy=arg0.getProxy();
		String actionName=actionProxy.getActionName();
		String namespace=actionProxy.getNamespace();
		String fullName=namespace+"/"+actionName;
		if(!session.containsKey("USER")){
			boolean allow=false;
			for(String url:allowAction){
				
				if(url.equals(fullName)){
					allow=true;
					break;
				}			
			}
			if(!allow) return Action.LOGIN;
		}else{
			List<UserPrivilege> userPrivilegeList=(List<UserPrivilege>) session.get("USERPRIVILEGE");
			
			for(int i=0;i<userPrivilegeList.size();i++){
				String url=userPrivilegeList.get(i).getModuleURL().getNamespace()+"/"+userPrivilegeList.get(i).getModuleURL().getAction();
				
				if(url.equals(fullName)&&userPrivilegeList.get(i).getMask()=='0'){
					String message="您没有访问权限！";
				
					throw new AccessDeniedException(message);
					
				}
			}
			Module m=moduleURLService.loadRelativeModule(actionName, namespace);
			if (m!=null){
				List<ModuleURL> moduleURLList=moduleURLService.loadRelativeModuleURL(m);
				arg0.getInvocationContext().put("MODULEURL", moduleURLList);
			}
		}
		return arg0.invoke();
	}

	public void setModuleURLService(ModuleURLService moduleURLService) {
		this.moduleURLService = moduleURLService;
	}
	
}
