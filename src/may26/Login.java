package may26;

public class Login {

   private String username;
   private String password;

    public String getUsername() {
        return username;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void loginToApp(String username, String password){
        if(username.equalsIgnoreCase(this.username) && password.equals(this.password)){
            System.out.println("Welcome to the Application");
        } else {
            System.out.println("Invalid credentials, Please try again...");
        }
    }
}
