package entity;

public class UserOrder {
	
	private int id;
	private int userId;
	private String realname;
	private String phone;
	private String address;
	private String postCode;
	private String accountCode;
	private String accountDate;
	private String execute="ok";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public String getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}
	public String getExecute() {
		return execute;
	}
	public void setExecute(String execute) {
		this.execute = execute;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String toString(){
		return "Order [id=" + id + ",userId=" + userId + ",realname= " + realname + ",phone=" + phone + ",address= "+ address + ", postCode= " + postCode +",accountCode ="+accountCode+ 
				",accountDate="+ accountDate + ",execute="+ execute +
				"]";
	}
	

}
