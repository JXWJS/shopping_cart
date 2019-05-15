package action;

import entity.Product;
import bean.CartItem;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import service.CartService;

public class CartAction {
	private  int id;     //商品id
	private String name; //商品名字
	private int count;   //商品存货
	private int price;   //商品价格
	
	private String uid;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}


	

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String addToCart(){
		CartService cart;
		Product product=new Product();
		CartItem cartItem=new CartItem();
		product.setId(id);
		product.setName(name);
		product.setCount(count);
		product.setPrice(price);
		cartItem.setProduct(product);
		
		Map session=ActionContext.getContext().getSession();
		if((CartService)session.get("cart")==null){
			 cart=new CartService();
			cart.addToCart(cartItem);
			session.put("cart", cart);
		}else{
			 cart=(CartService)session.get("cart");
			 cart.addToCart(cartItem);
			 session.put("cart", cart);
		}
		System.out.print(product.getId());
		System.out.print(product.getCount());
		System.out.print(product.getPrice());
		System.out.print(product.getName());
		System.out.print(cartItem.getProduct());
		System.out.print(cart);
		
		return "success";
		
		
	}
	
	public String showCart(){
		Map session=ActionContext.getContext().getSession();
		CartService cart=(CartService)session.get("cart");
		if((CartService)session.get("cart")==null || cart.getMap().isEmpty() ||cart.getMap().size()==0){
			return "error";
		}else{
			cart=(CartService)session.get("cart");
			
			if(cart.getMap().containsKey(uid)){
				CartItem oldCartItem=cart.getMap().get(uid);
				oldCartItem.setCount(count);
				cart.getMap().put(uid, oldCartItem);
				//session.putIfAbsent("cart",cart);
				session.put(uid, oldCartItem);
				return "success";
			}
			
			
			System.out.println("现在开始修改------");
			System.out.println(id);
			System.out.println(count);
			
			
    		ActionContext.getContext().put("cart", cart);
			System.out.print(cart);
			System.out.print(cart.getMap().getClass());
			return "success";
		}
			
		}
		
	
	public String deleteCart(){
		Map session=ActionContext.getContext().getSession();
		CartService cart=(CartService)session.get("cart");
		cart.clearCart();
		return "success";
		
	}
	
	
	
	

}
