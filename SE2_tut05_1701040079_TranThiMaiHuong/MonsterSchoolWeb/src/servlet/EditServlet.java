package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import model.User;

/**
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 */

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;

	public void init() {
		userDAO = new UserDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			editUser(request,response);
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			showNewForm(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private void showNewForm(HttpServletRequest request, HttpServletResponse response) 
	throws IOException,ServletException{
		RequestDispatcher dispatcher= request.getRequestDispatcher("edit-user.jsp");
		dispatcher.forward(request, response);
		
	}

	private void editUser (HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		String idRaw= request.getParameter("id");
		int id=Integer.parseInt(idRaw);
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	String mobile=request.getParameter("mobile");
	userDAO.editUser(id,name,address,mobile);
	response.sendRedirect("list");
	}
}

