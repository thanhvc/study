package rxb.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import rxb.crm.dao.SaleRecordDao;
import rxb.crm.model.SaleRecord;
import rxb.crm.service.SaleRecordService;
@Service("saleRecordService")
public class DefaultSaleRecordService implements SaleRecordService {
	@Resource
	SaleRecordDao saleRecordDao;
	@Override
	public void createSaleRecord(SaleRecord sr) {
		 saleRecordDao.insertSaleRecord(sr);

	}

	@Override
	public void updateSaleRecord(SaleRecord sr) {
		 saleRecordDao.updateSaleRecord(sr);

	}

	@Override
	public void deleteSaleRecord(Integer id) {
		 saleRecordDao.deleteSaleRecord(id);

	}

	@Override
	public SaleRecord findById(Integer id) {
		return  saleRecordDao.findById(id);
	}

	@Override
	public List<SaleRecord> findAll() {
		 return saleRecordDao.findAll();
	}

	@Override
	public List<SaleRecord> findByKey() {
		 return saleRecordDao.findByKey();
	}

}
