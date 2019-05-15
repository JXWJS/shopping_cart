package entity;

public class ProductOrder {
	private int id;
	private String productId;
	private String accountCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String toString(){
		return  id+" "+productId+" "+accountCode+" ";
	}

}
