package service;

import entity.Product;
import dao.ProductDao;

import java.util.List;


public class ProductService {
	private ProductDao productDao;
	

	public  List<Product> queryProduct(){
		productDao=new ProductDao();
		return productDao.queryProduct();
	}
	
	public List<Product> queryByPage(int page){
		productDao=new ProductDao();
		return productDao.queryByPage(page);
	}

	public Product detailProduct(int id){
		productDao=new ProductDao();
		return productDao.detailProduct(id);
	}
}
