package message;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
			String address = in.nextLine();
		    Family fm1 = new Family(address);
		    
		    while(true) {
		    int id = in.nextInt();
		    if (id==-1) {
		    	break;
		    }
		    String c = in.nextLine();
		    String name = in.nextLine();	
		    String gender = in.nextLine();
		    fm1.addMember(id, name, gender);
		    }
		    
		    String c2 = in.nextLine();
		    String address2 = in.nextLine();
		    Family fm2 = new Family(address2);
		    
		    while(true) {
		    int id = in.nextInt();
		    if (id==-1) {
		    	break;
		    }
		    String c = in.nextLine();
		    String name = in.nextLine();	
		    String gender = in.nextLine();
		    fm2.addMember(id, name, gender);//÷ÿ∏¥‘ı√¥∏ƒ
		    }
		    in.close();
		    fm1.print();
		    fm2.print();
	}

}
