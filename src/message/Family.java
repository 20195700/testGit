package message;

import java.util.ArrayList;

public class Family {

	private String address;
	private ArrayList<Person> ps = new ArrayList <Person>();
	
	public Family(String address) {
		super();
		this.address = address;
	}
	
	public void addMember(int id,String name,String gender) {
		Person t = new Person(id,name,gender);
		ps.add(t);
	}
	
	public void print () {
		  System.out.println(address);
		  System.out.println(ps.size());
		  for(Person a:ps) {
		    System.out.println(a);
		  }
	}

}
