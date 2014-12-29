package classes;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Timeline {
    
    /**
     *
     */
        // database
    public static String URL = "jdbc:mysql://localhost/database11";
    public static String username = "abanoub";
    public static String password = "abanob3333";
    public static Connection c1 = null;
    public static Statement ste = null ;
    // database 
    public static Scanner input = new Scanner(System.in);
    public void getPosts() throws Exception{
    
                       Class.forName("com.mysql.jdbc.Driver").newInstance();
          c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	   ste = (Statement) c1.createStatement();
        
           String id= input.next();
        
        ResultSet result =  ste.executeQuery("select * from post where id = "+id+")");
        System.out.println(result.getString("title")+"  "+result.getTime("time"));
    
    }
    
}
