package tka_july10;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.AggregateProjection;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

import com.mysql.cj.x.protobuf.MysqlxCrud.Projection;

public class C26_CrtAgrrProjection {
	
public static void main(String[] args) {
		
		Configuration cfgn = new Configuration();
		cfgn.configure();
		cfgn.addAnnotatedClass(C0_Employee.class);
		
		SessionFactory sf = cfgn.buildSessionFactory();
		Session ssn = sf.openSession();
		
		Criteria crt = ssn.createCriteria(C0_Employee.class);		
		
		// Select max(salary) from employee;
//		AggregateProjection maxProjection = Projections.max("salary");
//		crt.setProjection(maxProjection);
//		Object maxRes = crt.uniqueResult();
//		System.out.println("MaxRes > " + maxRes);

		crt.setProjection(Projections.max("salary"));		// Short
		System.out.println("MaxRes > " + crt.uniqueResult());
		
		// Select avg(salary) from employee;
		crt.setProjection(Projections.avg("salary"));
		System.out.println("avgRes > " +crt.uniqueResult());
		
	}
}
