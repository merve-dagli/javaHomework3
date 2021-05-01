package javaHomework3;

public class UserManager {
    public void signIn(String firstName,String lastName,String email,String password) {
    	System.out.println("Sayýn "+firstName+" "+lastName+" kaydýnýz gerçekleþtirildi.");
    }
    public void logIn(String email,String password) {
    	System.out.println(email+" giriþ yaptýnýz.");
    }
    public void logOut(String email,String password) {
    	System.out.println(email+" çýkýþ yaptýnýz.");
    }
    public void editProfile(String firstName,String lastName,String email,String password) {
    	System.out.println("Profiliniz düzenlendi");
    }
    
}
