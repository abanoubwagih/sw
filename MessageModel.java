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
public class MessageModel {
     // database
    public static String URL = "jdbc:mysql://localhost/database11";
    public static String username = "abanoub";
    public static String password = "abanob3333";
    public static Connection c1 = null;
    public static Statement ste = null ;
    // database 
    public static Scanner input = new Scanner(System.in);
    public void createMessage()throws Exception{
        // database
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	    ste = (Statement) c1.createStatement();
        // database 
            
            String username = input.next();
            String content = input.nextLine();
            ste.execute("insert into message(user,content)"
                    + " values ('"+username+"','"+content+"')");
    }
            
    public void deleteMessage() throws Exception{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
          c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	   ste = (Statement) c1.createStatement();
           
           
           int id= input.nextInt();
           ste.execute("delete from message where id = '"+id+"'"); 
    }
                     
   public void getMessage() throws Exception{
       Class.forName("com.mysql.jdbc.Driver").newInstance();
          c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	   ste = (Statement) c1.createStatement();
        
           String id= input.next();
        
        ResultSet result =  ste.executeQuery("select * from message where id = "+id+")");
        System.out.println(result.getString("user")+"  "+result.getString("content"));
   }
                              
    public void updateMessage() throws Exception{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
          c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	   ste = (Statement) c1.createStatement();
        int id = input.nextInt();
         String content = input.nextLine(); 
        ste.execute("update message set content = '"+content+"' where id = '"+id+"'"); 
    }
}
