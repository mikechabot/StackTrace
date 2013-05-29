package chabot.utils.learning;

import org.apache.log4j.Logger;

// Code flow training

public class ExampleOne {

	static Logger log = Logger.getLogger(ExampleOne.class);
	
	private static void method1() {
		log.info("Inside method1()");
		method2();
	}
	
	private static void method2() {
		log.info("Inside method2()");		
	}
	
	private static void method3() {
		method4();
		log.info("Inside method3()");		
	}
	
	private static void method4() {
		log.info("Inside method3()");		
	}
	
	public static void main(String[] args) {		
		log.info("Starting Main method");
		method1();
		log.info("Ending Main method");		
	}	
}

















