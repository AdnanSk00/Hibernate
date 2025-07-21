package tka_july7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class C3_DisplayStudent {		// @Table(name = "student")
	
	public static void main(String[] args) {
		
		Configuration cfgn = new Configuration();
		cfgn.configure();			// link --> "hibernate.cfg.xml"
		cfgn.addAnnotatedClass(C1_Student.class);
		SessionFactory sf = cfgn.buildSessionFactory();		// sf == Connection [jdbc]
		Session ssn = sf.openSession();						// createStatement();
		
//		C1_Student stud = ssn.load(C1_Student.class, 1);	// shows Exception if(id==null)
		C1_Student stud = ssn.get(C1_Student.class, 5); 	// DQL - SELECT * FROM student where id = 1; + st.executeQuery(query);
		System.out.println("\nstud > " + stud);
	
	}
	
	
}
