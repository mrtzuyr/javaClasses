package com.class31;

public class Registration {
/*Create Registration Class in which you would have variables as email,
 *userName and password that have an access scope only within its own class.
 *After creating an object of the class user should be able to call methods and
 *in each method separately pass values to set users email,
 *
 *
 *  Valid email consider to be only gmail
 *	Valid userName and password cannot be empty and should be of length larger than 6 characters. 
 *	Also valid password cannot contain userName.
 */
    
    //setters
	private String email, userName, password; 
    public void setEmail(String email) {
        if((email.substring(email.indexOf('@') +1)).startsWith("gmail")) {
            this.email = email;
        } 
        else {
            System.out.println("Invalid email address.");
        }
    }
    
    public void setUserName (String userName) {
        if(!(userName.isEmpty()) && userName.length()>6) {
            this.userName = userName;
        }
        else {
            System.out.println("Invalid username.");
        }
    }
    
    public void setPw(String password) {
        if(!(password.isEmpty()) && password.length()>6 && !(password.contains(this.userName))) {
            this.password = password;
        }
        else {
            System.out.println("Invalid password.");
        }
    }
    
    //getters
    
    public String getEmail() {
        return this.email;
    }
    
    public String getUserName() {
        return this.userName;
    }
    
    public String getPw() {
        return this.password;
    }
    
}

