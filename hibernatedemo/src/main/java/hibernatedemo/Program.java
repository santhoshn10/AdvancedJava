package hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import hibernatedemo.User;

public class Program {
	
	public static void main(String[] args) throws Exception{
		System.out.println("hello world");
		Session session=HibernateUtilities.getsessionFactory().openSession(); 
		session.beginTransaction();
		
		User user = new User();
		user.setName("raj");
		user.setGoal(250);
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
		HibernateUtilities.getsessionFactory().close();

}
}
