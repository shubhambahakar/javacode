package com.employee;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HiberNateUtils {
	public static SessionFactory getSessionFactory() {
		Properties hibernateProperties =new Properties();
	   hibernateProperties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
	   hibernateProperties.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate?useSSL=false");
		hibernateProperties.put(Environment.USER, "root");
		hibernateProperties.put(Environment.PASS, "Gulalshesh");
		hibernateProperties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		hibernateProperties.put(Environment.SHOW_SQL, "true");
		hibernateProperties.put(Environment.HBM2DDL_AUTO, "update");
		
		Configuration conf = new Configuration();
		
		conf.setProperties(hibernateProperties);
      
		Class<Courses> entityClass = Courses.class;
		conf.addAnnotatedClass(entityClass);
		
		SessionFactory factory=conf.buildSessionFactory();// This se hibernet file load kar vanu 6
		
		return factory;
	}

}
