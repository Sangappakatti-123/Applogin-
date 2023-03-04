package threadproject;

import java.util.Scanner;

public class LoginThread extends Thread{
      private Application app;
      
      Scanner sc=new Scanner(System.in);

	public LoginThread(Application app) {
		super();
		this.app = app;
	}
     
	public void run() {
		System.out.println("enter username");
		String username=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		app.login(username,password);
	}
      
}
