package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import entity.User;
import service.UserService;

public class UserAction {
	private User user;
	private UserService userService;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String register(){
		userService=new UserService();
		userService.register(user);
		return "success";
		
	}
	
	public String login(){
		boolean flag=false;
		userService=new UserService();
		flag=userService.checkLogin(user);
		Map session=ActionContext.getContext().getSession();
		if(flag){
			session.put("NowLoginUsername", user.getUsername());
			return "success";
		}else{
			return "error";
		}
	}
	
	public String loginOut(){
		Map session=ActionContext.getContext().getSession();
		session.clear();
		return "success";
		
	}
	

}
