package hibernatedemo;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class HibernateUtilities {

	public static SessionFactory sessionFactory;
	public static StandardServiceRegistry standardRegistry;
	static {
		try {
	    final StandardServiceRegistry standardRegistry = 
		new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		sessionFactory = new MetadataSources( standardRegistry ).buildMetadata().buildSessionFactory();

		} 
		catch(HibernateException exception){
			System.out.println("problem creating session factory");	
			exception.printStackTrace();
			StandardServiceRegistryBuilder.destroy(standardRegistry);

		}
	}

	public static SessionFactory getsessionFactory(){
		return sessionFactory;
	}
}


