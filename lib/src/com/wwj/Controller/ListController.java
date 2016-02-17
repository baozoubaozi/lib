package com.wwj.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wwj.daoImpl.CRUDDaoImpl;
import com.wwj.pojo.Book;

public class ListController  extends  HttpServlet{
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException {
				// TODO Auto-generated method stub
				doPost(req, resp);
			}
			@Override
			protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			// TODO Auto-generated method stub
			            List<Book> b=  CRUDDaoImpl.searchBooks();
			            HttpSession session=req.getSession();
			            session.setAttribute("books", b);
			            req.getRequestDispatcher("books.jsp").forward(req, resp);
			                    
			}
}
