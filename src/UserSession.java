
public class UserSession {
	private static UserSession instance;
	private String userId;
	private String userName;
	
	private UserSession() {
		
	}
	
	public static UserSession getInstance() {
		if (instance == null) {
			synchronized (UserSession.class) {
				if (instance == null) {
					instance = new UserSession();
				}
			}
		}
		return instance;
	}
	
	public void setUserInfo(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void clearSession() {
		userId = null;
		userName = null;
	}
}
