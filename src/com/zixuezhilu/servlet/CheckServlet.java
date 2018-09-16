package com.zixuezhilu.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zixuezhilu.entity.User;
import com.zixuezhilu.service.CheckUserService;

public class CheckServlet extends HttpServlet{
	private CheckUserService ck = new CheckUserService();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("uname");
		String password = req.getParameter("passwd");
		User user = new User();
		RequestDispatcher rd = null;
		user.setUserName(username);
		user.setPassWorld(password);
		boolean b = ck.Check(user);
		String foward = "";
		if(b) {
			System.out.println(req.getContextPath());
			foward = "/login/success.jsp";
		}else {
			foward = "/login/error.jsp";
		}
		rd = req.getRequestDispatcher(foward);
		rd.forward(req, resp);
		
	}
	

}
