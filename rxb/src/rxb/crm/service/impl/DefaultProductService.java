package rxb.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import rxb.crm.dao.ProductDao;
import rxb.crm.model.Product;
import rxb.crm.service.	ProductService;
@Service("productService")
public class DefaultProductService implements ProductService {
	@Resource
	ProductDao ProductDao;
	@Override
	public void createProduct(Product p) {
		ProductDao.insertProduct(p);

	}

	@Override
	public void updateProduct(Product p) {
		ProductDao.updateProduct(p);

	}

	@Override
	public void deleteProduct(Integer id) {
		ProductDao.deleteProduct(id);

	}

	@Override
	public Product findById(Integer id) {
		return ProductDao.findById(id);
	}

	@Override
	public List<Product> findAll() {
		return ProductDao.findAll();
	}

	@Override
	public List<Product> findByKey(String key) {
		return ProductDao.findByKey(key);
	}

}
