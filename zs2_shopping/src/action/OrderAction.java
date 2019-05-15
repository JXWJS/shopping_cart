package action;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;

import entity.UserOrder;
import entity.ProductOrder;
import service.OrderService;
import service.UserService;
import service.CartService;
import util.DateUtil;


public class OrderAction {
	
	private UserOrder order;

	public UserOrder getOrder() {
		return order;
	}

	public void setOrder(UserOrder order) {
		this.order = order;
	}
	
	 public String insertOrder(){
		 System.out.print(order);
		 Map session=ActionContext.getContext().getSession();
		 String username=(String)session.get("NowLoginUsername");
		 
		 OrderService orderService=new OrderService();
		 UserService userService=new UserService();
		 ProductOrder productOrder=new ProductOrder();
		 
		 CartService cart=(CartService)session.get("cart");
		 int id=userService.queryByID(username);
		 order.setUserId(id);
		 orderService.insert(order);
		 
		 productOrder.setAccountCode(order.getAccountCode());
		 DateUtil dateUtil=new DateUtil();
		 Set set =cart.getMap().keySet();
		 Iterator it=set.iterator();
		 String a=null;
		 String a1=null;
		 while(it.hasNext()){
			 a+=(String) it.next()+" ";
//			 productOrder.setProductId((int)it.next());
//			// productOrder.setNum(dateUtil.createAccountCode((int)it.next()));
//			// orderService.insertProduct(productOrder);
			 a1=a.replaceAll("null", " ");
		 }
		 productOrder.setProductId(a1);
		 orderService.insertProduct(productOrder);
		 cart.clearCart();
		 
		// ActionContext.getContext().put("cart", cart);
	
	        return "success";
	    }
	
}
