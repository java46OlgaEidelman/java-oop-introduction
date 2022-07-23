package telran.people;

public class Person implements Comparable<Person> {
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

@Override
public int compareTo(Person o) {
	
	return Long.compare(this.id, o.id);
}
	
}

