package tka_july7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import com.mysql.cj.jdbc.Driver;

public class C2_DemoHibernate {
	public static void main(String[] args) {
//	Driver d;
		
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	DriverManager.getConnection(url, userId, pass);
		
	Configuration cfgn = new Configuration();
//	cfgn.configure("hibernate.cfg.xml");		// link --> hibernate.cfg.xml	
	cfgn.configure();							// byDefault - link --> hibernate.cfg.xml	
	cfgn.addAnnotatedClass(C1_Student.class);
	
	System.out.println("1. hibernate cfg file ready");
//	point to [Hibernate.cfg.xml --> <hibernate-configuration>
		
	
//	content -- 4+3 properties --> <session-factory>		// session-factory == Connection | sf == Connection [JDBC]
	SessionFactory sf = cfgn.buildSessionFactory(); 	// Connection con = DriverManager.getConnection(url, uid, password);
//	System.out.println("sf > " + sf.toString());	sf == <session-factory> content[<property "key">value</property] </session-factory>
	System.out.println("2. SessionFactory is ready");
	
	// Inserting student data --> jdbc --> statement --> create --> fire --> process result
	Session ssn = sf.openSession();						// Statement st = con.createStatement();
//	Student s1 = new Student(6, "Rohit", 94.4f);
	C1_Student s1 = new C1_Student(5, "Shami", 89.9f);	// query = "insert into c1_student values(5, "Shami", 89.9f)";
	
	// create table student(int id, name varchar(), per float);
	
	ssn.save(s1);										// in rowCnt = st.executeUpdate(query);
	// query fire - save(insert into Student.class) --> executeUpdate() DML
	
	ssn.beginTransaction().commit();
	System.out.println("Inserted in jdbc successfully...");
		
	}	
}

// NOTE : As class name we make in java same as class name table is created in mysql workbench but if we change the class name later in our code so new table with current query is created in mysql workbench. We can see below o/p.

//Hibernate: 
//    
//    create table C1_Student (
//       id integer not null,
//        name varchar(255),
//        per float not null,
//        primary key (id)
//    ) engine=InnoDB
//Jul 09, 2025 3:53:37 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
//INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
//2. SessionFactory is ready
//Hibernate: 
//    insert 
//    into
//        C1_Student
//        (name, per, id) 
//    values
//        (?, ?, ?)
//Inserted in jdbc successfully...
