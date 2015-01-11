package rxb.crm.web.customer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jxl.Sheet;
import jxl.Workbook;

import rxb.crm.model.Customer;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ImportCustomerAction extends ActionSupport {
	File doc;
	String docFileName;
	String docContentType;
	List<Customer> customerList=new ArrayList<Customer>();
	Map<String,Object> session=ActionContext.getContext().getSession();
	
	@Override
	public void validate() {
		if(doc==null){
			this.addFieldError("doc", "δѡ���κ��ļ�");
		}
	}
	
	@SuppressWarnings("resource")
	@Override
	public String execute() throws Exception {
		String fileName=getDocFileName();
		int f=fileName.length()-3;
		String arg=String.valueOf(fileName.charAt(f))+String.valueOf(fileName.charAt(f+1))+String.valueOf(fileName.charAt(f+2));
		if(arg.matches("txt")){
			try{
				InputStream is=new FileInputStream(doc);

				byte[] buffer=new byte[1024*1024];
				int length=0;
				String data="";
				while((length=is.read(buffer))!=-1){
					String s=new String(buffer,"gbk");
					data+=s;
				}
				
				String[] c=data.split("\n");
				
				for(int i=0;i<c.length;i++){
					Customer customer=new Customer();
					
					String[] el=c[i].split(",");
					customer.setName(el[0].trim());
					customer.setType(el[1].trim());
					customer.setTelephone(el[2].trim());
					customer.setContactMan(el[3].trim());
					customer.setAddress(el[4].trim());
					
					customerList.add(customer);	
				}
				
			}catch(IOException e){
				e.printStackTrace();
			}
		}else{
			Workbook workbook=Workbook.getWorkbook(doc);
			Sheet sheet=workbook.getSheet(0);
			int rows=sheet.getRows();
			
			for(int i=0;i<rows;i++){
				Customer c=new Customer();
				c.setName(sheet.getCell(0,i).getContents());
				c.setType(sheet.getCell(1,i).getContents());
				c.setTelephone(sheet.getCell(2,i).getContents());
				c.setContactMan(sheet.getCell(3,i).getContents());
				c.setAddress(sheet.getCell(4,i).getContents());
				customerList.add(c);
			}
		}
		session.put("CUSTOMERS", customerList);
		return SUCCESS;
	}
	
	public File getDoc() {
		return doc;
	}
	public void setDoc(File doc) {
		this.doc = doc;
	}

	public String getDocFileName() {
		return docFileName;
	}

	public void setDocFileName(String docFileName) {
		this.docFileName = docFileName;
	}

	public String getDocContentType() {
		return docContentType;
	}

	public void setDocContentType(String docContentType) {
		this.docContentType = docContentType;
	}


	
}
