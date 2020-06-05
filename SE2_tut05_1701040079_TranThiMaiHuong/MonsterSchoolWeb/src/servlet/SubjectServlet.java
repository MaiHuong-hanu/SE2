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

import dao.SubjectDAO;
import model.Subject;

/**
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 */

@WebServlet("/subject")
public class SubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SubjectDAO subjectDAO;

	public void init() {
		subjectDAO = new SubjectDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			listUser(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Subject> listSubject = subjectDAO.selectAllSubjects();
		request.setAttribute("listSubject", listSubject);
		RequestDispatcher dispatcher = request.getRequestDispatcher("subject-list.jsp");
		dispatcher.forward(request, response);
	}
}

