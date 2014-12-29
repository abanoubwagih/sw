package classes;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class PublicPost extends PrivacyPost{

    public PublicPost(Post p) {
        super(p);
    }
    
    @Override
    public void setAllowedMembers(ArrayList <User> currentAllowed){
        this.currentAllowed.addAll(currentAllowed);
    
    }
    
}
