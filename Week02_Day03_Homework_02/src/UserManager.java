
public class UserManager {
	
	public void CreateNewUser(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName()+ " Kullan�c�s� Eklendi.");
	}
	
	public void UpdateUser(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName()+ " Kullan�c�s� Guncellendi.");
	}
	
	public void DeleteUser(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName()+ " Kullan�c�s� Silindi.");
	}
	
	public void GetAllUsers(User[] users) {
		for(User user : users) {
			System.out.println( user.getFirstName()+" "+user.getLastName());
		}
	}
}
