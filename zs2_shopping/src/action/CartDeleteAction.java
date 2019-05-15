package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import service.CartService;

public class CartDeleteAction {
	
	private String id;
	private String sub;



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}

	





	public String getSub() {
		return sub;
	}



	public void setSub(String sub) {
		this.sub = sub;
	}



	public String DeleteToProduct(){
		Map session=ActionContext.getContext().getSession();
		CartService cart=(CartService)session.get("cart");
		cart.removeCartItem(id);
		if(cart==null || cart.getMap().isEmpty() ||cart.getMap().size()==0){
		session.remove("cart");
			return "error";
		}
		
		return "success";
		
}
}
