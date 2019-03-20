package servlet;

import java.io.*;
import java.util.List;
 
import javax.servlet.*;
import javax.servlet.http.*;
import dao.AddMessageDao;
import dao.student;
public class SearchName extends HttpServlet{
	private static final long serialVersionUID = 1L;  
	  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        this.doPost(req, resp);  
    }
    @SuppressWarnings("unused")
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {
    	//设置编码，防止乱码
    	req.setCharacterEncoding("UTF-8"); 
    	resp.setCharacterEncoding("UTF-8");
    	//将JSP中name="name"的值赋给Sring类型的name
    	String xuehao=req.getParameter("xuehao");
    	//新建一个AddMessageDao
    	AddMessageDao dao = new AddMessageDao();
    	String sql = "select * from qmxde where xuehao ='";
        sql += xuehao + "'";
        //创建一个列表，调用dao的SearchName
    	List<student> SearchName;
		try {
			SearchName = dao.SearchName(xuehao);
	        //保存查询的信息用setAttribute将值给SearchName    
	        req.setAttribute("SearchName", SearchName);
	        //转发请求  
	        req.getRequestDispatcher("/SearchName.jsp").forward(req, resp);  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
    }
}