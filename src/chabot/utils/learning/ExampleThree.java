package chabot.utils.learning;

import org.apache.log4j.Logger;

// NullPointerException training

public class ExampleThree {

	static Logger log = Logger.getLogger(ExampleThree.class);
	
	public static void main(String[] args) {		
		
		Name name = new Name();
		name.setFirstName("Mike");
	
		log.debug("Starting");
		
		try {
			int length = name.getFirstName().length() + name.getLastName().length();
			log.info("Name length is " + length);
		} catch (NullPointerException ex) {
			throw new IllegalStateException ("Big Problem!", ex);
		} 
		
		log.info("Ending");		
	}	
}

class Name {
	
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