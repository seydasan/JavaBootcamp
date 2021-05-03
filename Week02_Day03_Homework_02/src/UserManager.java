
public class UserManager {
	
	public void CreateNewUser(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName()+ " Kullanıcısı Eklendi.");
	}
	
	public void UpdateUser(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName()+ " Kullanıcısı Guncellendi.");
	}
	
	public void DeleteUser(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName()+ " Kullanıcısı Silindi.");
	}
	
	public void GetAllUsers(User[] users) {
		for(User user : users) {
			System.out.println( user.getFirstName()+" "+user.getLastName());
		}
	}
}
