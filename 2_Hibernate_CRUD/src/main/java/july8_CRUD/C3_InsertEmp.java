package july8_CRUD;

import java.util.Scanner;

import org.hibernate.Session;

public class C3_InsertEmp {
	
	public static void insert() {
		Scanner sc = new Scanner(System.in);
	
		Session ssn = C1_MyHBConf.MyHbConf();
		
		System.out.println("Connection build...");
		
//		C2_Employee emp = new C2_Employee(101, "core", 30.89);
//		C2_Employee emp = new C2_Employee(102, "adv", 90.10);
//		C2_Employee emp = new C2_Employee(103, "good", 800.4);
//		C2_Employee emp = new C2_Employee(104, "excellent", 10007.2);
		
		System.out.print("Insert id : ");	int id = sc.nextInt();
		System.out.print("Insert name : ");	String name = sc.next();
		System.out.print("Insert salary : ");	double salary = sc.nextDouble();
		
		C2_Employee emp = new C2_Employee(id, name, salary);
		ssn.save(emp);
		
		ssn.beginTransaction().commit();
		System.out.println("Inserted into db successfully...");
			
	}
		
}
