/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author abanoub wagih
 */
public class PremiumUser extends User{
    
    public String creditCardNumber ;

      public static Scanner input = new Scanner(System.in);
    public PremiumUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void payByCredit(){
        
        System.out.println("enter your cridet number ");
        creditCardNumber = input.next();
        
    }
}
