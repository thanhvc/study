package rxb.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;


import org.springframework.web.context.WebApplicationContext;

import rxb.crm.model.Customer;
import rxb.crm.model.Department;
import rxb.crm.model.Module;
import rxb.crm.model.ModuleURL;
import rxb.crm.model.User;
import rxb.crm.service.CustomerService;
import rxb.crm.service.DepartmentService;
import rxb.crm.service.ModuleService;
import rxb.crm.service.ModuleURLService;
import rxb.crm.service.UserService;

public class WebUtil {
	static Map<String,Object> map=new HashMap<String,Object>();
	
	static ApplicationContext ctx=WebUtil.getApplicationContext();
	
	@SuppressWarnings("unchecked")
	public static List<Department> getDepartmentList(){
		if(map.containsKey("DEPARTMENTS")){ 
			return (List<Department>) map.get("DEPARTMENTS"); 
		}else{
			DepartmentService departmentService=ctx.getBean(DepartmentService.class);
		
			List<Department> departmentList=departmentService.findAll();
			map.put("DEPARTMENTS", departmentList);

			return (List<Department>) map.get("DEPARTMENTS");
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public static List<User> getUserList(){
		if(map.containsKey("USERS")){ 
			return  (List<User>) map.get("USERS"); 
		}
		UserService userService=ctx.getBean(UserService.class);
		
		
		List<User> userList=userService.findAll();
		map.put("USERS",userList);

		
		return (List<User>) map.get("USERS");
		
	}
	@SuppressWarnings("unchecked")
	public static List<Customer> getCustomerList(){
		if(map.containsKey("CUSTOMERS")){ 
			return  (List<Customer>) map.get("CUSTOMERS"); 
		}
		CustomerService customerService=ctx.getBean(CustomerService.class);
		
		
		List<Customer> customerList=customerService.findAll();
		map.put("CUSTOMERS",customerList);

		
		return (List<Customer>) map.get("CUSTOMERS");
	}
	
	@SuppressWarnings("unchecked")
	public static List<Module> getModuleList(){
		if(map.containsKey("MODULES")){
			return (List<Module>) map.get("MODULES");
		}
		ModuleService moduleService=ctx.getBean(ModuleService.class);
		
		List<Module> moduleList= moduleService.listModule();
		map.put("MODULES", moduleList);
	
		return (List<Module>) map.get("MODULES");
	}
	
	@SuppressWarnings("unchecked")
	public static List<ModuleURL> getModuleURLList(){
		if(map.containsKey("MODULEURLS")){
			return (List<ModuleURL>) map.get("MODULEURLS");
		}
		ModuleURLService moduleURLService=ctx.getBean(ModuleURLService.class);
		
		
		List<ModuleURL> moduleURLList= moduleURLService.findAll();
		map.put("MODULEURLS", moduleURLList);
	
		return (List<ModuleURL>) map.get("MODULEURLS");
	}
	
	public static void removeDepartmentList(){
		map.remove("DEPARTMENTS");
	}
	public static void removeUserList(){
		map.remove("USERS");
	}
	public static void removeModuleList(){
		map.remove("MODULES");
	}
	public static void removeModuleURLList(){
		map.remove("MODULEURLS");
	}
	public static void removeCustomerList(){
		map.remove("CUSTOMERS");
	}
	 public static ApplicationContext getApplicationContext(){
			ServletContext sc=ServletActionContext.getServletContext();
		    Object ctx = sc.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		    if (ctx instanceof ApplicationContext){
		    	return (ApplicationContext)ctx;
		    }
		    throw new RuntimeException("Can not obtain spring application context.");
	 }

}
