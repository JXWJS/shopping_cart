package entity;

import java.io.Serializable;

public class Product implements Serializable{
	
	private int id;
	private String name;
	private int count;
	private int price;
	private String picUrl;
	private String comment;
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
	
	
	
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String toString(){
		return "Product [id=" + id + ",name=" + name + ",count= " + count + ",price=" + price +
				",picUrl="+picUrl +",comment="+ comment +"]";
	}
	

	

}
