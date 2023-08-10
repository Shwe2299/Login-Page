//Class for Users 
// Define user class, attributes and gunctions 
public class User {
  private String userName;
  private String password;

  public User(String userName, String password){
    this.userName = userName;
    this.password = password;
  }

  //Get and set
  public String getUserName(){
    return userName;
  }

  public String getPassword(){
    return password;
  }
}
