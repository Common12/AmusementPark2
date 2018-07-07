import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 */
class UserDao {

    static void addRecord(User user) {
        Session session = CommonToolClass.getSession();
         session.save(user);
        session.beginTransaction().commit();
      }
    
}
