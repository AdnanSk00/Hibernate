package july8_CRUD;

import org.hibernate.Session;

public class C5_DeleteEmp {

	public static void delete() {
		Session ssn = C1_MyHBConf.MyHbConf();
		
		System.out.println("Connection build...");
		
		C2_Employee emp = ssn.get(C2_Employee.class, 2);
		
		if(emp != null) {
			ssn.delete(emp);
			ssn.beginTransaction().commit();
			
			System.out.println(emp.name + "Deleted successfully...");
		} else {
			System.out.println("emp does not exist");
		}
		
	}
}
