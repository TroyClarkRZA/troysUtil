/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package troysUtil;

/**
 *
 * @author yolod
 */
public class LogIn {

    public boolean LogIn(String savedUsername, String savedPassword, String inputUsername, String inputPassword) {
        if (inputUsername.equalsIgnoreCase(savedUsername) && inputPassword.equals(savedPassword)) {
            return true;
        } else {
            return false;
        }
    }

}
