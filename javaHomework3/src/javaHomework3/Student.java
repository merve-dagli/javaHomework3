package javaHomework3;

public class Student  extends User{
  private String address;
  private String communication;
  
  Student(){
	  
  }
  Student(int id, String firstName, String lastName, String password, String email, String course,
			String address,String communication) {
		this();
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setPassword(password);
		setEmail(email);
		setCourse(course);
		
	}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCommunication() {
	return communication;
}
public void setCommunication(String communication) {
	this.communication = communication;
}
}
