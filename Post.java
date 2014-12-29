package classes;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.util.ArrayList;
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
public class Post {
    
   public  ArrayList <User> currentAllowed;
   public String photoname;
   public String content;
   public static String URL = "jdbc:mysql://localhost/database11";
    public static String username = "abanoub";
    public static String password = "abanob3333";
    public static Connection c1 = null;
    public static Statement ste = null ;
    public static Scanner input = new Scanner(System.in);
   public void writePost(ArrayList <User> currentAllowed) throws Exception{
   
       this.currentAllowed.addAll(currentAllowed);
       String titel = input.next();
       System.out.println("enter post");
       content = input.nextLine();
       System.out.println("if there photo  : /n enter 1 for else  enter  /n 2 ");
       int c = input.nextInt();

        if(c == 1){
           photoname = input.next();
           ste.execute("insert into post (titel,content,photo)"
                    + " values ('"+titel+"','"+content+"','"+photoname+"')");
        }
        else{
            ste.execute("insert into post (titel,content)"
                    + " values ('"+titel+"','"+content+"')");
           
        }
   
   }
    
    
    
    
}
