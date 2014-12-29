/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author abanoub wagih
 */
public class PageModel {
        // database
    public static String URL = "jdbc:mysql://localhost/database11";
    public static String username = "abanoub";
    public static String password = "abanob3333";
    public static Connection c1 = null;
    public static Statement ste = null ;
    // database 
    public static Scanner input = new Scanner(System.in);
    
    public void createPage()throws Exception {
        
     
        // database
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	    ste = (Statement) c1.createStatement();
        // database 
		
    String name = input.next();
    String photo = input.next();
     ste.execute("insert into page(name,photo)"
                    + " values ('"+name+"','"+photo+"')");
    }
    public void deletePage() throws Exception{
        
         Class.forName("com.mysql.jdbc.Driver").newInstance();
          c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	   ste = (Statement) c1.createStatement();
           
           
           String name= input.next();
           ste.execute("delete from pase where name = '"+name+"'");
    }
   
    public void getPage()throws Exception{
               Class.forName("com.mysql.jdbc.Driver").newInstance();
          c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	   ste = (Statement) c1.createStatement();
        
           String id= input.next();
        
        ResultSet result =  ste.executeQuery("select * from page where id = "+id+")");
        System.out.println(result.getString("name")+"  "+result.getString("photo"));
    }
    
    public void updatePage()throws Exception{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
          c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	   ste = (Statement) c1.createStatement();
        int id = input.nextInt();
         String photo = input.next(); 
        ste.execute("update page set photo = '"+photo+"' where id = '"+id+"'");
    }
}
