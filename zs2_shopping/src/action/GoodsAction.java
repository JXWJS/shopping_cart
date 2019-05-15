package action;

import service.ProductService;
import entity.Product;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import dao.ProductDao;

public class GoodsAction {
	private ProductService productService;
	private int id;
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String showProduct(){
		productService=new ProductService();
		
		List<Product> list=productService.queryProduct();
		ActionContext.getContext().put("list", list);
		return "success";
		
	}
	
	
	public String queryByPage(){
		HttpServletRequest request=ServletActionContext.getRequest();
		int page=Integer.parseInt(request.getParameter("pages"));
		productService=new ProductService();
		//ProductDao productDao=new ProductDao();
		List<Product> list=productService.queryByPage(page);
		request.setAttribute("pages", page+1);
		request.setAttribute("list",list);
		return "success";
		
	}
	
	public String detailProduct(){
		productService=new ProductService();
		Product product=productService.detailProduct(id);
		Map session=ActionContext.getContext().getSession();
		session.put("product", product);
		System.out.print(product);
		return "success";
	}

}
