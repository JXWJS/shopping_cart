package dao;

import entity.UserOrder;
import entity.ProductOrder;

public interface OrderBaseDao {
	public void insert(UserOrder order);
	
	public void insertProduct(ProductOrder productOrder);

}
