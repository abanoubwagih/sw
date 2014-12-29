/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author abanoub wagih
 */
public class User {
    
    protected String name;
    protected String eMail;
    protected List<User> friends;
    protected Message message;
    protected List<IPage> pages;
    protected List<IGroup> subscribedGroups ;
    public User(){
        
    }
    public void sendFriendRequest(){
        
    }
    
    public void addFriend(){
        
    }
    
    public void signUp(String email , String password , String fname , String lname) throws Exception{
        UserModel u = new UserModel();
        u.CreateUser( email ,  password , fname ,  lname);
        
        JOptionPane.showMessageDialog(null, "done sign up");
    }
    
    public void logIn()throws Exception{
        
        UserModel u = new UserModel();
          User l = u.getUser();
       
    }
    
    public void logOut(){
        
        
    }
    public void getCureentActivityUser(){
        
        
    }

}
