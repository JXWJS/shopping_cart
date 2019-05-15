package bean;

import java.io.Serializable;

import entity.Product;

public class CartItem implements Serializable{
	
	private Product product; //��Ʒ
	
	private int count=1;//����������Ʒ����
	
	private double subtotal; //С��

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
