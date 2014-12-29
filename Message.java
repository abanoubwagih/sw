/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 *
 * @author abanoub wagih
 */
public  class Message {
        public static Scanner input = new Scanner(System.in);
             // database
    public static String URL = "jdbc:mysql://localhost/database11";
    public static String username = "abanoub";
    public static String password = "abanob3333";
    public static Connection c1 = null;
    public static Statement ste = null ;
    // database 
    public void sendMessage() throws Exception{
        // database
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	    ste = (Statement) c1.createStatement();
        // database 
        System.out.println("enter your friend name");
        String user = input.next();
        System.out.println(" enter your message ");
        String content = input.nextLine();
        ste.execute("insert into message(user,content)"
                    + " values ('"+user+"','"+content+"')");
    }

}
