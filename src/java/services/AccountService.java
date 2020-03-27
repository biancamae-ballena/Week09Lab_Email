/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author 785284
 */
public class AccountService {
    public boolean changePassword(String uuid, String password) {
        UserService us = new UserService();
        try {
            User user = us.getByUUID(uuid);
            user.setUserPassword(password);
            user.setResetPasswordUUID(null);
            UserDB ur = new UserDB ();
            ur.update(user);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
