package chapter2;
import java.io.*;
import java.sql.*;
 class GFG {
    public static void main(String[] args) throws Exception
    {
        String url = "C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin"; 
        String username = "localhost:3306"; 
        String password = "root";
        String query = "select *from students"; 
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query); 
        rs.next();
        String name = rs.getString("name"); 
 
        System.out.println(name); // Print result on console
        st.close(); // close statement
        con.close(); // close connection
        System.out.println("Connection Closed....");
    }
}