package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class UserDao {
	
	
	public boolean updates(Connection con,student stu) throws SQLException{
		String sql = "update qmxde set name=?,sex=?,xuehao=?,phone=?,xueyuan=?,major=?,zubie=?"
				+ "where id = ?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, stu.getName());
		ps.setString(2, stu.getSex());
		ps.setString(3, stu.getXuehao());
		ps.setString(4, stu.getPhone());
		ps.setString(5, stu.getXueyuan());
		ps.setString(6, stu.getMajor());
		ps.setString(7, stu.getZubie());
		ps.setInt(8, stu.getId());
		if(ps.executeUpdate()>0)
			return true;
		else
			return false;
	}
	
	public student selects(Connection con,int id) throws SQLException{
		String sql=("select * from qmxde where id = ?");
		student stu = null;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setLong(1, id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			stu = new student();
			stu.setId(rs.getInt("id"));
			stu.setName(rs.getString("name"));
			stu.setSex(rs.getString("sex"));
			stu.setXuehao(rs.getString("xuehao"));
			stu.setPhone(rs.getString("phone"));
			stu.setXueyuan(rs.getString("xueyuan"));
			stu.setMajor(rs.getString("major"));		
			stu.setZubie(rs.getString("zubie"));
		}
		rs.close();
		ps.close();
		
		return stu;
		
	}
	
}
