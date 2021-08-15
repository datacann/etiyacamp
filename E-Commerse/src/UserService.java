import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {
	
	
	
	public void register(User user ) {
		if(user.getPassword().length() < 6 ) {
			System.out.println("parola en az 6 karakterden oluşmalıdır");
			return;
		}
		
		if(user.getEmail().trim()=="" || user.getFirstName().trim()=="" || user.getPassword().trim()== "" || user.getLastName().trim() =="" ) {
			System.out.println("lütfen tüm alanları doldurun");
		}
		
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

       
            if (pattern.matcher(user.getEmail()).find() == false) {
                System.out.println("The email address entered is not in accordance with the format. Example: example@example.com");
                return ;
            }
        
        
		
		for(User users : getUsers()) {
			if(user.getEmail()==users.getEmail()) {
				System.out.println("bu mail zaten kullanılıyor");
				return;
			}
			}
		
		
		
		if(user.getFirstName().length() <3 || user.getLastName().length()<3 ) {
			System.out.println("ad ve soyad en az 2 karakterden oluşmalıdır");
			return;
		}
		
		System.out.println("e-mail adresiniz onaylandı. Kayıt başarılı");
		System.out.println("Kullanıcı adı ve soyadı : " + user.getFirstName() + user.getLastName());
		System.out.println(" maili : " + user.getEmail());
		
	}
	

			public void login(String email , String password) {
				for(User u : getUsers()) {
					if(email==u.getEmail() && password== u.getPassword() ) {
						System.out.println("giriş yapıldı");
						return;
					}
					
				}
				System.out.println("giriş yapılamadı");
				
			
			}
			
			
			
				
				
			public User[] getUsers() {
				User user1 = new User();
				user1.setFirstName("atacan");
				user1.setLastName("erdoğan");
				user1.setPassword("1234567");
				user1.setEmail("datacan@gmail.com");
				
				User user2 = new User();
				user2.setFirstName("engin");
				user2.setLastName("demiroğ");
				user2.setPassword("123453454");
				user2.setEmail("engin@gmail.com");
				
				User[] users = {user1 , user2};
				
				return users;
			}
	
		
	

}
