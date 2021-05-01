package javaHomework3;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.setId(1);
		student1.setFirstName("Merve");
		student1.setLastName("Daðlý");
		student1.setPassword("111111");
		student1.setEmail("m@m");
		student1.setCourse("JAVA + REACT");
		student1.setAddress("Adana");
		student1.setCommunication("03221111111");
		StudentManager studentManager=new StudentManager();
		studentManager.editProfile(student1.getFirstName(),student1.getLastName(),student1.getEmail(),student1.getPassword(),student1.getAddress(),student1.getCommunication());
		studentManager.logOut(student1.getEmail(),student1.getPassword());
		
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		instructor1.setPassword("121212");
		instructor1.setEmail("e@e");
		instructor1.setCourse("JAVA + REACT");
		instructor1.setBiography("Yazýlým geliþtirmeye lisede \"yazýlým\" bölümünde okurken...");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.logIn(instructor1.getEmail(),instructor1.getPassword());
		instructorManager.updateBiography(instructor1.getBiography());
	}

}
