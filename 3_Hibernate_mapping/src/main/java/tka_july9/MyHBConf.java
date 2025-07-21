package tka_july9;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyHBConf {
	
	static Configuration cfg = null;
	static SessionFactory sf= null;
	
	static SessionFactory getMyHBConf(){
		cfg = new Configuration().configure().addAnnotatedClass(Product.class);
		sf = cfg.buildSessionFactory();
		return sf;
	}
}
