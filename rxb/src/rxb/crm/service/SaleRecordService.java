package rxb.crm.service;

import java.util.List;

import rxb.crm.model.SaleRecord;

public interface SaleRecordService {
	public void createSaleRecord(SaleRecord sr);
	public void updateSaleRecord(SaleRecord sr);
	public void deleteSaleRecord(Integer id);
	public SaleRecord findById(Integer id);
	public List<SaleRecord> findAll();
	public List<SaleRecord> findByKey();
}
