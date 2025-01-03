package Model.Controller;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import Model.BO.ReaderBO;

/**
 * Servlet implementation class ConfirmReader
 */
@WebServlet("/ConfirmReader")
public class ConfirmReader extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReaderBO readerBO = new ReaderBO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmReader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = (String) request.getParameter("id");
		try {
			readerBO.changeStatus(id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		response.sendRedirect("/QuanLyThuVien/ManageReader");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ManageReader");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
