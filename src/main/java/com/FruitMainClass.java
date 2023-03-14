package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FruitMainClass {

	public static void main(String[] args) {


		//----------------------------
        SessionFactory sf= new Configuration().configure().buildSessionFactory();        
        // obtains the session
        Session session = sf.openSession();
        session.beginTransaction();
        //--------------------------
		
		
		Fruit fr= new Fruit("mango",35,"yellow");
		   session.save(fr);
        
		   Fruit fr1= new Fruit("banana",25,"yellow");
		   session.save(fr1);
		   
		   
		   Fruit fr2= new Fruit("apple",45,"red");
		   session.save(fr2);
		   
        

		   Fruit fr3= new Fruit("orange",22,"yellow");
		   session.save(fr3);
		   
		   
		   Fruit fr4= new Fruit("guava",23,"green");
		   session.save(fr4);
		   
        //------------    
        session.getTransaction().commit();
        session.close();
        //-----------------------
		
	}

}
