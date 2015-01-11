package rxb.crm.web.customer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import rxb.crm.model.Customer;
import rxb.crm.service.CustomerService;

import com.opensymphony.xwork2.ActionSupport;

public class ExportCustomerAction extends ActionSupport {
	ByteArrayInputStream inputStream;

//	String realPath=ServletActionContext.getServletContext().getRealPath("/download");
	@Resource
	CustomerService customerService;
	public String execute() throws Exception {
		List<Customer> customerList=customerService.findAll();
		String data="";
		for(int i=0;i<customerList.size();i++){
			Customer c=customerList.get(i);
			data+=c.getName()+"£¬"+c.getType()+"£¬"+c.getTelephone()+"£¬"+c.getContactMan()+"£¬"+c.getAddress()+"\r\n";
		}
		byte[] bs=data.getBytes();
		
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		baos.write(bs);
		baos.flush();
		byte[] buffer=baos.toByteArray();
		inputStream=new ByteArrayInputStream(buffer);
		
		
		return SUCCESS;
	}
	public String jexcel() throws Exception{
		List<Customer> customerList=customerService.findAll();
		//WritableWorkbook workbook=Workbook.createWorkbook(new File(realPath+"/output.xls"));
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		WritableWorkbook workbook=Workbook.createWorkbook(baos);
		WritableSheet sheet=workbook.createSheet("FirstSheet", 0);
		for(int i=0;i<customerList.size();i++){
			Customer c=customerList.get(i);
			
			Label label1=new Label(0,i,c.getName());
			sheet.addCell(label1);
			Label label2=new Label(1,i,c.getType());
			sheet.addCell(label2);
			Label label3=new Label(2,i,c.getTelephone());
			sheet.addCell(label3);
			Label label4=new Label(3,i,c.getContactMan());
			sheet.addCell(label4);
			Label label5=new Label(4,i,c.getAddress());
			sheet.addCell(label5);
		}	
		workbook.write();
		workbook.close();
//		is=new FileInputStream(realPath+"/output.xls");
		inputStream=new ByteArrayInputStream(baos.toByteArray());
		return SUCCESS;
	}
	public CustomerService getCustomerService() {
		return customerService;
	}
	public ByteArrayInputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(ByteArrayInputStream inputStream) {
		this.inputStream = inputStream;
	}


}
