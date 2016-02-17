package com.wwj.pojo;

import java.io.Serializable;

public class Book   implements  Serializable{
     		private int id;
    		private String bname;
    		private int price;
    		public Book(){
    			
    		}
    		public Book(int id,String bname,int price){
    			 this.id=id;
    			 this.bname=bname;
    			 this.price=price;
    			
    		}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getBname() {
				return bname;
			}
			public void setBname(String bname) {
				this.bname = bname;
			}
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
    		
}
