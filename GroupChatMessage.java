/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.List;

/**
 *
 * @author abanoub wagih
 */
public class GroupChatMessage extends Message{
 
    public List<User> allUser ;
    public String title;
    
    public  void addReceiver(List<User> allUser){
        this.allUser.addAll(allUser);
    }
}
