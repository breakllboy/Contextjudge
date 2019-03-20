package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static String DRIVER="com.mysql.cj.jdbc.Driver";
    private static String URL="jdbc:mysql://localhost:3306/student?useSSL=false&serverTimezone=Hongkong&characterEncoding=utf-8&autoReconnect=true";
    private static String user="root";
    private static String key="1234";
    public static Connection conn;
    
    //加载驱动
        static{
            try {
                Class.forName(DRIVER);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        //连接数据库
        public static Connection getConnection(){
         try {
            conn = DriverManager.getConnection(URL, user, key);
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return conn;
        }
}