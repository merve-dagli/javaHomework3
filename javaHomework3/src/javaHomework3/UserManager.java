package javaHomework3;

public class UserManager {
    public void signIn(String firstName,String lastName,String email,String password) {
    	System.out.println("Say�n "+firstName+" "+lastName+" kayd�n�z ger�ekle�tirildi.");
    }
    public void logIn(String email,String password) {
    	System.out.println(email+" giri� yapt�n�z.");
    }
    public void logOut(String email,String password) {
    	System.out.println(email+" ��k�� yapt�n�z.");
    }
    public void editProfile(String firstName,String lastName,String email,String password) {
    	System.out.println("Profiliniz d�zenlendi");
    }
    
}
