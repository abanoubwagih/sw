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
public class PagePost extends Post {
    
    /**
     *
     * @param currentAllowed1
     */
    @Override
    public void writePost(ArrayList <User> currentAllowed1) throws Exception{
    
    
       this.currentAllowed.addAll(currentAllowed1);
       
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
