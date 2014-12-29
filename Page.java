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
public class Page implements IPage{

    public List<User> userList;
    @Override
    public void likeAPage(List<User> userList) {
        this.userList.addAll(userList);
    }
    
}
