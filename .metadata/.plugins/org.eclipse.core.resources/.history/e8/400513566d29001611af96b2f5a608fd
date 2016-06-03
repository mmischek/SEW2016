package password;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class PasswordView {
  private final static String superSecret= "passwort";
  private final static String besterUser ="admin";
  
  private String password;
  private String username;
  
  private boolean login = false; //true if login is completed
  
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  
  public boolean getValidation(){
    if (password.equals(superSecret) && username.equals(besterUser)) {
    	login = true;
    	return true;
    }
    login = false;
    return false;
  }
  
  public String getGreeting() {
      return "Password or username wrong!";
  }
}