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
public interface IGroup {
    
   public void addMember( String user, String name )throws Exception ;
   public void removeMember(String name)throws Exception;
   public void setRole( String role );
   public void setPrivacy();
}
