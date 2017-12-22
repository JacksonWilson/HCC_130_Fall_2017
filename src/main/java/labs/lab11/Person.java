package labs.lab11;

/*
 * Author:       Todd Simeone

 * Name:         Jackson Wilson
 *
 * Date Written:  1/16/2003
 * 
 * Date Modified: 12/21/2017
 */

public class Person {
	String name;
	
	Person() {
		name = "Anonymous";
	}
	
	Person(String id) {
		name = id;
	}
	
	public String getName() {
		return name;
	}
}