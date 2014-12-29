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
import javax.swing.JOptionPane;


/**
 *
 * @author abanoub wagih
 */
public class UserModel {
    // database
    public static String URL = "jdbc:mysql://localhost/database11";
    public static String username = "abanoub";
    public static String password = "abanob3333";
    public static Connection c1 = null;
    public static Statement ste = null ;
    // database 
    public static Scanner input = new Scanner(System.in);
    
    public void CreateUser(String eMail , String Userpassword ,String fname , String lname) throws Exception{
        
        JOptionPane.showMessageDialog(null, "user model ");
        // database
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	    ste = (Statement) c1.createStatement();
        // database 
				
        int c ;
        JOptionPane.showMessageDialog(null, "connect done ");
        System.out.println("what type of user : /n enter 1 for premium user /n 2 for normal user ");
        c = input.nextInt();
        
         String name = fname + " " + lname ;
   
    
        if(c == 1){
            
            ste.execute("insert into user(name,password,email)"
                    + " values ('"+name+"','"+Userpassword+"','"+eMail+"')");
        }
        else{
            
            String creditCardNumber = input.next();
            ste.execute("insert into user(name,password,email,creditCardNumber)"
                    + " values ('"+name+"','"+Userpassword+"','"+eMail+"','"+creditCardNumber+"')");
        }
        
    }
    
    public void DeleteUser()throws Exception{
         Class.forName("com.mysql.jdbc.Driver").newInstance();
          c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	   ste = (Statement) c1.createStatement();
           
           
           String eMail= input.next();
           ste.execute("delete from user where email = '"+eMail+"'");
           
    }
    
    public User getUser() throws Exception {
       
         
        Class.forName("com.mysql.jdbc.Driver").newInstance();
          c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	   ste = (Statement) c1.createStatement();
        
           String eMail= input.next();
        
           String Userpassword = input.next();
        
        ResultSet result =  ste.executeQuery("select * from user where email = '"+eMail+"' and "
                + "password = '"+Userpassword+"'");
        
        String name = result.getString("name");
        int  id = result.getInt("id");
        String creditCardNumber = result.getString("creditCardNumber");
        if(creditCardNumber != null) {
            
             PremiumUser user = new PremiumUser();
            user.creditCardNumber = creditCardNumber;
            user.name = name ;
            user.eMail = eMail ;
            return user ;
        }
        else{
          NormalUser  user = new NormalUser();
            user.name = name ;
            user.eMail = eMail ;
            return user ;
        }
        
    }
    
    public void updateUser()throws Exception{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
          c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	   ste = (Statement) c1.createStatement();
        int id = input.nextInt();
         String newname = input.next(); 
        ste.execute("update user set name = '"+newname+"' where id = '"+id+"'");
        
    }
}
