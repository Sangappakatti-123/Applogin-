package threadproject;

public class Mainclass {
    public static void main(String[] args) {
		Application app=new Application("sangu","sangu@123");
		LoginThread l1=new LoginThread(app);
		LoginThread l2=new LoginThread(app);
		l1.start();
		l2.start();
	}
}
