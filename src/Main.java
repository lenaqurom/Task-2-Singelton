
public class Main {
	public static void main(String []args) {
		// using the UserSession singleton
		UserSession session = UserSession.getInstance();
		
		// setting user information
		session.setUserInfo("111", "lina qurom");
		
		System.out.println("User ID: " + session.getUserId());
		System.out.println("User Name: " + session.getUserName());
		
		// clearing the session
		session.clearSession();
		
		System.out.println("User ID after clear: " + session.getUserId());
		System.out.println("User Name after clear: " + session.getUserName());
	}
}