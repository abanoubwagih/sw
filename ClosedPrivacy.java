/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.util.Scanner;

/**
 *
 * @author abanoub wagih
 */
public class ClosedPrivacy extends GroupPrivacy{
    
    // database
    public static String URL = "jdbc:mysql://localhost/database11";
    public static String username = "abanoub";
    public static String password = "abanob3333";
    public static Connection c1 = null;
    public static Statement ste = null ;
    // database 
    public static Scanner input = new Scanner(System.in);
    
    public void isAllowed(User user){
            allowedUser.add(user);
    }
}
