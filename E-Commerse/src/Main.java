
public class Main {

	public static void main(String[] args) {
			User user = new User();
			
			user.setFirstName("suat");
			user.setLastName("özçelik");
			user.setEmail("datacan12@gmail.com");
			user.setPassword("123456767");
			
			
			UserService userService = new UserService();
			userService.register(user);
			
			GoogleManager googleManager = new GoogleManager();
			googleManager.registerWithGoogleAccount(user);
			
			userService.login("datacan@gmail.com", "1234567");	
			userService.login("datacanmail.com", "1234567");	
	}

}
