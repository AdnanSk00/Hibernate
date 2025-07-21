package july8_CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class C1_MyHBConf {
	
	static Configuration cfgn = null;
	static SessionFactory sf = null;
//	static Session ssn = null;
	
	public static Session MyHbConf() {
		
		cfgn = new Configuration().configure().addAnnotatedClass(C2_Employee.class);
		sf = cfgn.buildSessionFactory();
		
		return sf.openSession();
		
	}
}
