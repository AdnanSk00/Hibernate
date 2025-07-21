package july8_CRUD;

import org.hibernate.Session;

public class C4_DisplayEmp {

	public static void display() {
		Session ssn = C1_MyHBConf.MyHbConf();
		
		System.out.println("Connection build...");
		
		 C2_Employee emp = ssn.get(C2_Employee.class, 102);
		 System.out.println("emp > " + emp);
		
	}
}
