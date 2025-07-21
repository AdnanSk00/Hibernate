package july8_CRUD;

import java.util.Scanner;

public class C7_CRUD_Menu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******* CRUD Operations in using Hibernate *******");
		System.out.println("1. Insert");
		System.out.println("2. Display");
		System.out.println("3. Delete");
		System.out.println("4. Update");
		System.out.print("Select any one operation : ");
		int opt = sc.nextInt();
		
		switch(opt) {
		
			case 1 : 
				C3_InsertEmp.insert();
				break;
			case 2 : 
				C4_DisplayEmp.display();
				break;
			case 3 : 
				C5_DeleteEmp.delete();
				break;
			case 4 : 
				C6_UpdateEmp.update();
				break;
			default :
				System.err.println("Invalid option");
		}
	}
}
