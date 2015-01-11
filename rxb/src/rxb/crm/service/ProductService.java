package rxb.crm.service;

import java.util.List;

import rxb.crm.model.Product;

public interface ProductService {
	public void createProduct(Product p);
	public void updateProduct(Product p);
	public void deleteProduct(Integer id);
	public Product findById(Integer id);
	public List<Product> findAll();
	public List<Product> findByKey(String key);
}
