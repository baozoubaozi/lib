package com.wwj.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.wwj.pojo.Book;
import com.wwj.util.MySQLUtil;

public class CRUDDaoImpl {
	/**
	 * 
	 * @return  返回数据库的图书的集合
	 */
		  public static  List<Book>  searchBooks(){
			       List<Book>  books =new ArrayList<Book>();
			       ResultSet rs = null;
			       Statement st = null;
			       Connection con = null;
			  		try {
			  			String sql ="select * from books";
						  con=	MySQLUtil.getConnection();
						PreparedStatement pst =con.prepareStatement(sql);
						  rs = pst.executeQuery(); 
						while (rs.next()) {
							Book b = new Book(rs.getInt(1), rs.getString(2), rs.getInt(3));
							books.add(b);
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						MySQLUtil.close(rs, st, con);
					}
			  			
			  			
			  			return books;
		  }
		  
		  /**
		   * 
		   * @param id  传入要删除图书的ID
		   * @return  删除成功返回true 反之false
		   */
		  public   static  boolean  delBook(int id){
			    boolean flag = false;
			    ResultSet rs = null;
			       Statement st = null;
			       Connection con = null;
			  		try {
			  			String sql = "delete from books where id='" + id + "'";
						  con=	MySQLUtil.getConnection();
						PreparedStatement pst =con.prepareStatement(sql);
					    int i = pst.executeUpdate();
					    if(i>0){
					    	flag  = true;
					    }
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						MySQLUtil.close(rs, st, con);
					}
			  			
			  return  flag;
		  }
	  
}
