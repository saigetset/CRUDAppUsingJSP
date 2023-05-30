package com.sai.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sai.Service.IStudentService;
import com.sai.Service.ServiceFactory;
import com.sai.dto.Student;

@WebServlet("/controller/*")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static IStudentService stdService = null;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// String URI = request.getRequestURI();
		stdService = ServiceFactory.getStudentServiceObj();

		if (request.getRequestURI().endsWith("insert")) {
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			String city = request.getParameter("city");
			Student std = new Student();
			std.setName(name);
			std.setAge(age);
			std.setCity(city);
			String res = stdService.addStudent(std);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../insertResult.jsp");
			request.setAttribute("insertRes", res);
			dispatcher.forward(request, response);
		}
		
		
		if (request.getRequestURI().endsWith("search")) {
			String id = (request.getParameter("id"));
			Student res = stdService.searchStudent(Integer.parseInt(id));
			RequestDispatcher dispatcher = request.getRequestDispatcher("../selectResult.jsp");
			request.setAttribute("result",res);
			dispatcher.forward(request, response);
		}
		
		
		if (request.getRequestURI().endsWith("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String res = stdService.deleteStudent(id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../deleteResult.jsp");
			request.setAttribute("deleteRes",res);
			dispatcher.forward(request, response);
		}
		
		
		if (request.getRequestURI().endsWith("update")) {
			int id = Integer.parseInt(request.getParameter("id"));
			Student res = stdService.searchStudent(id);

			if (res != null) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("../updateForm.jsp");
				request.setAttribute("updateFormRes", res);
				dispatcher.forward(request, response);

			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("../selectResult.jsp");
				request.setAttribute("result", "failed");
				dispatcher.forward(request, response);
			}

		}
		
		if (request.getRequestURI().endsWith("editRecord")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			String city = request.getParameter("city");
			Student std = new Student();
			std.setId(id);
			std.setName(name);
			std.setAge(age);
			std.setCity(city);
			String res = stdService.updateStudent(std);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../editForm.jsp");
			request.setAttribute("editFormRes", res);
			dispatcher.forward(request, response);
		}
	}

}
