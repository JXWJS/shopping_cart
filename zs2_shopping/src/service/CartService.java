package service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import bean.CartItem;

public class CartService  implements Serializable{
	
	private static final long serialVersionUID = 1921333786113588640L;
	
	private Map<String, CartItem> map = new HashMap<String, CartItem>();
	private CartItem cartItem;
	private double total; //总价


	public CartItem getCartItem() {
		return cartItem;
	}

	public void setCartItem(CartItem cartItem) {
		this.cartItem = cartItem;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	

	public Map<String, CartItem> getMap() {
		return map;
	}

	public void setMap(Map<String, CartItem> map) {
		this.map = map;
	}

	
	//添加购物车项到购物车
	public void addToCart(CartItem cartItem ){
		
		int pid=cartItem.getProduct().getId();
		String id=String.valueOf(pid);
		
		if(map.containsKey(id)){
			CartItem oldCartItem=map.get(id);
			oldCartItem.setCount(oldCartItem.getCount()+cartItem.getCount());
		}else{
			map.put(id, cartItem);
		}
		this.total+=cartItem.getSubtotal();
}

	public void removeCartItem(String id){
		CartItem cartItem=map.remove(id);
		total-=cartItem.getSubtotal();
	}
	
	
	//清空购物车
	public void clearCart(){
		map.clear();
		total=0.0;
	}
	

	
}