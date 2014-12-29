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
public class GroupModel {
    Scanner input =new Scanner(System.in);
        // database
    public static String URL = "jdbc:mysql://localhost/database11";
    public static String username = "abanoub";
    public static String password = "abanob3333";
    public static Connection c1 = null;
    public static Statement ste = null ;
    // database 
    public void createGroup(String name) throws Exception{
        
        ste.execute("insert into group(name)"
                    + " values ('"+name+"')");
        
    }
    public void updateGroup()throws Exception{
         int id = input.nextInt();
        String newname = input.next(); 
        // database
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	    ste = (Statement) c1.createStatement();
        // database
        ste.execute("update group set name = '"+newname+"' where id = '"+id+"'");
        
    }
    public void getGroup()throws Exception{
        
        String selectName=input.nextLine();
        // database
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	    ste = (Statement) c1.createStatement();
        // database
        ResultSet result =  ste.executeQuery("select * from group where name = '"+selectName+"'");
        
        
    }
    public void deleteGroup()throws Exception{
        
        String gname = input.nextLine();
        // database
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	    ste = (Statement) c1.createStatement();
        // database
           ste.execute("delete from group where name = '"+gname+"'");
        
    }
    
}
