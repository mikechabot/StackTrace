package chabot.utils.learning;

import org.apache.log4j.Logger;

// NullPointerException training

public class ExampleTwo {

	static Logger log = Logger.getLogger(ExampleTwo.class);
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.setFirstName("Mike");
		person1.setLastName("Chabot");
		
		log.info("Person's Name: " + person1.getLastName() + ", " + person1.getFirstName());
		log.info("  Name Length: " + (person1.getLastName().length() + person1.getFirstName().length()));
		
		Person person2 = new Person();
		person2.setFirstName("Joe");		
		
		log.info("Person's Name: " + person2.getLastName() + ", " + person2.getFirstName());
		log.info(  "Name Length: " + (person2.getLastName().length() + person2.getFirstName().length()));		
	}	
}

class Person {
	
	String firstName;
	String lastName;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;		
	}
	
	public String getFirstName() {
		return firstName;		
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;		
	}
	
	public String getLastName() {
		return lastName;		
	}
}