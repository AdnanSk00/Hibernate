package tka_july10;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

import com.mysql.cj.x.protobuf.MysqlxCrud.Projection;

public class C25_CrtProjectionRestriction {
	
public static void main(String[] args) {
		
		Configuration cfgn = new Configuration();
		cfgn.configure();
		cfgn.addAnnotatedClass(C0_Employee.class);
		
		SessionFactory sf = cfgn.buildSessionFactory();
		Session ssn = sf.openSession();
		
		Criteria crt = ssn.createCriteria(C0_Employee.class);		
		
		// select * from employee [where, order by, like];
		// * col / result function left table name --> Projection

//		Select name, salary from employee where salary > 70000;
		crt.add(Restrictions.gt("salary", 70000.00));
		
		crt.setProjection(Projections.projectionList()		// short
				.add(Projections.property("name"))
				.add(Projections.property("salary"))
		);
				
		List <Object[]> empListRawData = crt.list();
		
		for(Object[] row : empListRawData) {
			System.out.println(row[0] + "  "+ row[1]);
		}
		
		
	}
}
