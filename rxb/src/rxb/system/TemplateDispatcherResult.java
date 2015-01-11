package rxb.system;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

import com.opensymphony.xwork2.ActionInvocation;

public class TemplateDispatcherResult extends ServletDispatcherResult {
	String templateLocation;
	
	String topLocation;
	String leftLocation;
	String footerLocation;
	
	public static final String CONTENTLOCATION_KEY="contentLocation";
	public static final String TOPLOCATION_KEY="topLocation";
	public static final String LEFTLOCATION_KEY="leftLocation";
	public static final String FOOTERLOCATION_KEY="footerLocation";
	
	public TemplateDispatcherResult() {
		super();
	}
	
	public TemplateDispatcherResult(String location){
		super(location);
	}
	
	public void setTemplateLocation(String templateLocation) {
		this.templateLocation = templateLocation;
	}
	
	public String getTemplateLocation() {
		return templateLocation;
	}
	
	public String getTopLocation() {
		return topLocation;
	}

	public void setTopLocation(String topLocation) {
		this.topLocation = topLocation;
	}

	public String getLeftLocation() {
		return leftLocation;
	}

	public void setLeftLocation(String leftLocation) {
		this.leftLocation = leftLocation;
	}

	public String getFooterLocation() {
		return footerLocation;
	}

	public void setFooterLocation(String footerLocation) {
		this.footerLocation = footerLocation;
	}

	@Override
	public void doExecute(String finalLocation, ActionInvocation invocation) throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		
		request.setAttribute(CONTENTLOCATION_KEY, finalLocation);
		
		if(topLocation!=null){
			request.setAttribute(TOPLOCATION_KEY, conditionalParse(topLocation, invocation));
		}
		if (leftLocation!=null){
			request.setAttribute(LEFTLOCATION_KEY, conditionalParse(leftLocation, invocation));
		}
		if (footerLocation!=null){
			request.setAttribute(FOOTERLOCATION_KEY, conditionalParse(footerLocation, invocation));
		}
		String finalTemplateLocation=conditionalParse(templateLocation, invocation);
		
		super.doExecute(finalTemplateLocation, invocation);
	}
	
}
