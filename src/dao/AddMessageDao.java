package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AddMessageDao {
   
    public List<student> SearchName(String Xuehao) throws Exception {  
    	  
        Connection conn = null;  
        Statement stmt = null;  
        List<student> classList= new ArrayList<student>();  
        try {  
            // 获取连接  
        	conn = DBUtil.getConnection();
            String sql = "select * from qmxde where xuehao ='";
            sql += Xuehao + "'";
            // 创建执行sql的对象 
            stmt = conn.createStatement();  
            //执行sql语句  
            ResultSet rs =stmt.executeQuery(sql);  
            //遍历结果集  
            while(rs.next()){  
            	int id = rs.getInt("id");
                String xuehao =rs.getString("xuehao");  
                String name=rs.getString("name");  
                String sex =rs.getString("sex");  
                String phone =rs.getString("phone");  
                String xueyuan =rs.getString("xueyuan");  
                String major =rs.getString("major");  
                String zubie =rs.getString("zubie");  
                student bean = new student(); 
                bean.setId(id);
                bean.setName(name);
                bean.setSex(sex);
                bean.setXuehao(xuehao);
                bean.setPhone(phone);
                bean.setXueyuan(xueyuan);
                bean.setMajor(major); 
                bean.setZubie(zubie); 
                classList.add(bean);  
            }  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
        return classList;  
    }
}
