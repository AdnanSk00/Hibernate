package july8_CRUD;

import java.util.Scanner;

import org.hibernate.Session;

public class C6_UpdateEmp {
	
	public static void update() {
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		double salary;
		
		Session ssn = C1_MyHBConf.MyHbConf();
		
		System.out.println("Connection build...");
		
		C2_Employee emp = ssn.get(C2_Employee.class, 102);
		System.out.println(emp + "\n");
		
		if(emp != null) {
			System.out.println("1.   Update id");
			System.out.println("2.   Update name");	
			System.out.println("3.   Update salary");
			System.out.println("12.  Update id + name");
			System.out.println("13.  Update id + salary");
			System.out.println("23.  Update name + salary");
			System.out.println("123. Update id + name + salary");
			System.out.print("****** >> Select one option to update : ");
			int opt = sc.nextInt();
			
			switch(opt) {
			case 1 : 
				System.out.print("Enter id : "); id = sc.nextInt();
				emp.setId(id);
				break;
			case 2 :
				System.out.print("Enter name : "); name = sc.next();
				emp.setName(name);
				break;
			case 3 : 
				System.out.print("Enter salary : "); salary = sc.nextDouble();
				emp.setSalary(salary);
				break;
			case 12 : 
				System.out.print("Enter id : "); id = sc.nextInt();
				emp.setId(id);
				System.out.print("Enter name : "); name = sc.next();
				emp.setName(name);
				break;
			case 13 :
				System.out.print("Enter id : "); id = sc.nextInt();
				emp.setId(id);
				System.out.print("Enter salary : "); salary = sc.nextDouble();
				emp.setSalary(salary);
				break;
			case 23 : 
				System.out.print("Enter name : "); name = sc.next();
				emp.setName(name);
				System.out.print("Enter salary : "); salary = sc.nextDouble();
				emp.setSalary(salary);
				break;
			case 123 : 
				System.out.print("Enter id : "); id = sc.nextInt();
				emp.setId(id);
				System.out.print("Enter name : "); name = sc.next();
				emp.setName(name);
				System.out.print("Enter salary : "); salary = sc.nextDouble();
				emp.setSalary(salary);
				break;
			default :
				System.err.println("You selected invalid options");
			}
			
			ssn.update(emp);
			ssn.beginTransaction().commit();
			
			System.out.println(emp.id + " Updated successfully...");
		} else {
			System.out.println("emp does not exist");
		}
		
		
	}
}
