package message;

public class Person {
	
	private int id;
	private String name;
	private String  gender;
	
	public Person(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return  id+"-"+name+"-"+gender;
		
	}
	
	
	
    
}
