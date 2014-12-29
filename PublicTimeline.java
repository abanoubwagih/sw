package classes;

import static classes.Timeline.URL;
import static classes.Timeline.c1;
import static classes.Timeline.input;
import static classes.Timeline.password;
import static classes.Timeline.ste;
import static classes.Timeline.username;
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
public class PublicTimeline extends Timeline {

    @Override
    public void getPosts() throws Exception{
    
                       Class.forName("com.mysql.jdbc.Driver").newInstance();
          c1 =  (Connection) DriverManager.getConnection(URL,username,password);
	   ste = (Statement) c1.createStatement();
        
           String id= input.next();
        
        ResultSet result =  ste.executeQuery("select * from post where id = "+id+")");
        System.out.println(result.getString("title")+"  "+result.getTime("time"));}
    public void getPublicGroups(){}
    
}
