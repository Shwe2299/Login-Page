import java.util.ArrayList;
import java.util.List;
 
//For managing Login details
public class LoginManager {
  private List<User> users;

  public LoginManager(){
    users = new ArrayList<>();
  }

  // like adding users
  public void addUser(User user){
    users.add(user);
  }

  // checking if the user is valid when logging in
  public boolean isValidUser(String userName, String password){
    for (User user : users) {
      if(user.getUserName().equals(userName)&& user.getPassword().equals(password)){
        return true;
      }
    }
    return false;
  }
}
