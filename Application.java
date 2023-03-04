package threadproject;

   public class Application {
      String registered_username;
      String registered_password;
	public Application(String registered_username, String registered_password) {
		super();
		this.registered_username = registered_username;
		this.registered_password = registered_password;
	}
      
	public void login(String given_username,String given_password) {
		if(given_username.equals(registered_username)&&given_password.equals(registered_password)) {
			System.out.println("login successfull");
		}
		else {
			System.out.println("Login failed! : Incorrect username or password");
		}
	}
}
