/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.List;

/**
 * @author abanoub wagih
 */
public class GroupPrivacy {
    
    protected List<User> allowedUser;
    
    public void getAllowedMembers(List<User> allowedUser){
        this.allowedUser.addAll(allowedUser);
    }
    
}
