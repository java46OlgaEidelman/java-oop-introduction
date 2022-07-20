package telran.person;

public class Person {
private long id;
private int yearBirth;
private String email;

public Person(long id,int birthYear,String email) {
	this.id = id;
	this.yearBirth = birthYear;
	setEmail(email);
}

public void setEmail(String email) {
	if(email.length() != 0) {
		this.email = email;
	}
}
public long getId() {
		return id;
	}
public int getBirthYear() {
	return yearBirth;
}
public String getEmail() {
	return email;
}
	
}

