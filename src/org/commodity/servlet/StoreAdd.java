package org.commodity.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.commodity.model.vo.*;
import org.commoditysale.jdbc.SqlSrvDBConn;


/**
 * Servlet implementation class StoreAdd
 */
@WebServlet("/StoreAdd")
public class StoreAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StoreAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("gb3212");
		response.setContentType("text/html; charset=utf-8"); 
		response.setCharacterEncoding("utf-8");
		
		String sno = request.getParameter("sno");
		String sname = request.getParameter("sname");
		String slocation = request.getParameter("slocation");
		String smanager = request.getParameter("smanager");
		
		HttpSession session = request.getSession();
		//StoreTable st = (StoreTable)session.getAttribute("st");
		
		StoreTable st = new StoreTable();
		st.setSNo(sno);
		st.setSName(sname);
		st.setSLocation(slocation);
		st.setSManager(smanager);
		
		ArrayList al = (ArrayList)session.getAttribute("al");
		al.add(st);
		
		PreparedStatement pstmt;
		SqlSrvDBConn sqlsrvdb = new SqlSrvDBConn();
		Connection ct = sqlsrvdb.getConn();
		
		try {
			pstmt = ct.prepareStatement("insert into StoreTable values(?,?,?,?)");
			pstmt.setString(1, st.getSNo());
			pstmt.setString(2, st.getSName());
			pstmt.setString(3, st.getSLocation());
			pstmt.setString(4, st.getSManager());
			pstmt.executeUpdate();
			response.sendRedirect("√≈µÍπ‹¿Ì.html");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
