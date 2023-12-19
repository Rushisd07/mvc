//Service layer used to connect to the external layer (jdbc)
//after getting the data injected into the bean
//This layer will give the data to the database (in the form of bean)


package com.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.add_dept_bean;
import com.dal.AddDept_DAL;

/**
 * Servlet implementation class Department_Service
 */
@WebServlet("/insertdata")
public class Department_Service extends HttpServlet {
	private static final long serialVersionUID = 1L;
	add_dept_bean bean;
	AddDept_DAL dal;
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Department_Service() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		dal = new AddDept_DAL(); //for Optimization
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		//retrive the bean from the session
		bean = (add_dept_bean)session.getAttribute("dept");
		//connecting to the database
		int res = dal.addDeptData(bean);
		if(res > 0) {
			out.println("Success");
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
