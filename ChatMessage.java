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
public class ChatMessage extends Message{
    
    public User receiver;
    
    
    public void addReceiver(User receiver){
        // done
        this.receiver = receiver;
    }
}
