package javaHomework3;

public class Instructor extends User {
	private String biography;

	Instructor() {

	}

	Instructor(int id, String firstName, String lastName, String password, String email,String course,String biography) {
		this();
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setPassword(password);
		setEmail(email);
		setCourse(course);
		
	}


	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}
}
