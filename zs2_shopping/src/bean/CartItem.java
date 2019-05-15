package bean;

import java.io.Serializable;

import entity.Product;

public class CartItem implements Serializable{
	
	private Product product; //商品
	
	private int count=1;//计数购买商品数量
	
	private double subtotal; //小计

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getSubtotal() {		
		
		return product.getPrice()*count;
	}

	
}
