package in.ineuron.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.model.Student;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Hello World");
	
	//1. Inform JVM to activate Hibernate
	Configuration configuration = new Configuration();
	configuration.configure();
	
	//Creating a Session Factory to hold many other objects required by HIBERNATE
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	
	//Using Session Factory Object, get only one session object to perform our persistence operation
	Session session=sessionFactory.openSession(); //connection object, L1-cache, ORM dialects, TXTManagement
	
	//Begin the transaction as the operation is non-select
	Transaction transaction=session.beginTransaction();
	
			
	//2. Create Persistence Object
	Student student=new Student();
	student.setSid(10);
	student.setSname("sachin");
	student.setSage(50);
	student.setSaddress("MI");
	
	//3. Perform persistence operation using Entity/Model/POJO Object
	session.save(student);
	
	//4. Generate the query and send to DB for execution
	transaction.commit();
	
	System.out.println("Object saved to DataBase...");
	}

}
