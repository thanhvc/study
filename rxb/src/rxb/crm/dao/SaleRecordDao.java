package rxb.crm.dao;

import java.util.List;

import rxb.crm.model.SaleRecord;

public interface SaleRecordDao {
	public void insertSaleRecord(SaleRecord sr);
	public void updateSaleRecord(SaleRecord sr);
	public void deleteSaleRecord(Integer id);
	public SaleRecord findById(Integer id);
	public List<SaleRecord> findAll();
	public List<SaleRecord> findByKey();
}
