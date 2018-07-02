package hoalv.hibernate.gentity;

import java.awt.print.Book;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TransportTaskManager {
    protected SessionFactory sessionFactory;

    protected void setup() {
        // code to load Hibernate Session factory
        // final StandardServiceRegistry registry = new
        // StandardServiceRegistryBuilder()
        // .configure() // configures settings from hibernate.cfg.xml
        // .build();
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            ex.printStackTrace();
        }

    }

    protected void exit() {
        // code to close Hibernate Session factory
        sessionFactory.close();
    }



    protected void readAll() {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            List tasks = (List) session.createQuery("FROM TransportTask").list();
            for (Iterator iterator = tasks.iterator(); iterator.hasNext();) {
                TransportTask task = (TransportTask) iterator.next();
                System.out.print("Type: " + task.getAssigneeType());
                System.out.print("  Cod: " + task.getCod());
                System.out.println("  Contact name: " + task.getDeliverContactName());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    protected void readByCustomer(int customerId) {
        // code to get book list
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            List tasks = (List) session.createQuery("FROM TransportTask T WHERE T.customerId = " + customerId).list();
            for (Iterator iterator = tasks.iterator(); iterator.hasNext();) {
                TransportTask task = (TransportTask) iterator.next();
                System.out.print("Type: " + task.getAssigneeType());
                System.out.println("  Contact name: " + task.getDeliverContactName());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    protected void readById(long id) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            TransportTask task = (TransportTask) session.get(TransportTask.class, id);

            System.out.print("Type: " + task.getAssigneeType());
            System.out.print("  Cod: " + task.getCod());
            System.out.println("  Contact name: " + task.getDeliverContactName());
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    protected void delete(long taskId) {
        // code to remove a task
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            TransportTask task = (TransportTask) session.get(TransportTask.class, taskId);
            session.delete(task);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
    public static void main(String[] args) {
        // code to run the program
        TransportTaskManager manager = new TransportTaskManager();
        manager.setup();
        manager.readByCustomer(2171);
        manager.exit();
    }
}
