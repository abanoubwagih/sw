/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author abanoub wagih
 */
public class NormalUser extends User{
    
    public void checkCurrentFriendsCount(){
        
        if(friends == null) System.out.println("you have no friend");
        else System.out.println("you have "+friends.size()+" friend");
    }
}
