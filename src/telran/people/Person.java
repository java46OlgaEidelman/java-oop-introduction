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
	
	if (email != null && !email.matches(emailRegex())) {
		throw new IllegalArgumentException(String.format("%s wrong email", email));
	}
	this.email = email;
}
private String emailRegex() {
	String prefix = "[A-Za-z\\d]([A-Za-z\\d]|[._-][A-Za-z\\d])+";
	String domain = "[A-Za-z\\d]([A-Za-z\\d]|-[A-Za-z\\d])+(\\.[A-Za-z\\d]([A-Za-z\\d]|-[A-Za-z\\d])+){1,4}";
	return String.format("(%s)@(%s)", prefix, domain);
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

