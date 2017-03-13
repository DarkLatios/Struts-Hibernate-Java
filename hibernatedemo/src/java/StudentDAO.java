
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class StudentDAO {
    //private Student m;
    private HibernateUtil helper;
    private Session session;
    
    public void addMember(Student s)
    {
        //m= new info("San", "Andreas", 5);
        session=helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(s);
        session.getTransaction().commit();
        session.close();
        
    }
    //return "success";
    
}
