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
public class PostModel {
    
    public static String URL = "jdbc:mysql://localhost/database11";
    public static String username = "abanoub";
    public static String password = "abanob3333";
    public static Connection c1 = null;
    public static Statement ste = null ;
    public static Scanner input = new Scanner(System.in);
    
    public void createPost() throws Exception{
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
            c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	    ste = (Statement) c1.createStatement();
				
        int c ;
        String titel = input.next();
        String content= input.next();
        System.out.println("what type of post : /n enter 1 for public user /n 2 for private user ");
        c = input.nextInt();
    
        if(c == 1){
            
            ste.execute("insert into post (titel,content)"
                    + " values ('"+titel+"','"+content+"')");
        }
        else{
            
            ste.execute("insert into post (titel,content,private)"
                    + " values ('"+titel+"','"+content+"','private')");
        }
        
    }
    
    public void  deletePost() throws Exception{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
          c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	   ste = (Statement) c1.createStatement();
           
           
           String titel= input.next();
           ste.execute("delete from post where titel = '"+titel+"'");
    }
    
    public void  getPost() throws Exception{
                       Class.forName("com.mysql.jdbc.Driver").newInstance();
          c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	   ste = (Statement) c1.createStatement();
        
           String id= input.next();
        
        ResultSet result =  ste.executeQuery("select * from post where id = "+id+")");
        System.out.println(result.getString("title")+"  "+result.getTime("time"));
    }
    
    public void  updatePost()throws Exception{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
          c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	   ste = (Statement) c1.createStatement();
        int id = input.nextInt();
         String content = input.next(); 
        ste.execute("update post set content = '"+content+"' where id = '"+id+"'");
    }
}
