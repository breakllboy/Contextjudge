package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DBUtil;
import dao.UserDao;
import dao.student;


/**
 * Servlet implementation class update
 */
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		Connection con = null;
		int id = Integer.valueOf(request.getParameter("userN"));
		UserDao sImpl = new UserDao();
		try {
			con = DBUtil.getConnection();
			student student = sImpl.selects(con,id);
			request.setAttribute("student", student);
			String forward = "/xiugai.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		Connection con = null;
		con = DBUtil.getConnection();
		int id = Integer.valueOf(request.getParameter("id"));
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String xuehao = request.getParameter("xuehao"); 
		String phone = request.getParameter("phone");
		String xueyuan = request.getParameter("xueyuan");
		String major = request.getParameter("major");
		String zubie = request.getParameter("zubie");
		
		student stu = new student();
		stu.setId(id);
		stu.setName(name);
		stu.setSex(sex);
		stu.setXuehao(xuehao);
		stu.setPhone(phone);
		stu.setXueyuan(xueyuan);
		stu.setMajor(major);
		stu.setZubie(zubie);

		
		
		UserDao dao = new UserDao();
		String forward = null;
		boolean flag;
		try {
			flag = dao.updates(con,stu);
			if(flag){
				forward = "/success.jsp";
				RequestDispatcher RD = request.getRequestDispatcher(forward);
				RD.forward(request, response);
			}
			else{
				forward = "/error.jsp";
				RequestDispatcher RD = request.getRequestDispatcher(forward);
				RD.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
