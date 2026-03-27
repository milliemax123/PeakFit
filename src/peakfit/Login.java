/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peakfit;

/**
 * This page is to demonstrate how login would work but is just a prototype
 *  There is only one set of credentials for a succesful login as we have no registration
 *Login.java
 * @author Vinentas Tarasevicius 
 * x23524449
 */
public class Login {
    
    private String correctUsername = "amelia";
    private String correctPassword = "1234";

    public static Members loggedInMember; //member object 

    //sucess login gives this user info 
    public boolean checkLogin(String username, String password) {
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            loggedInMember = new Members("amelia", "14/10/2004", "Premium");
            return true;
        }
        return false;
    }
    
}
