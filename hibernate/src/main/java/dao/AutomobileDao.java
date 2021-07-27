package dao;

import entity.Automobile;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AutomobileDao {
    public void saveAutomobile(Automobile automobile) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Object object = session.save(automobile);
            session.get(Automobile.class, (Serializable) object);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }


    public void updateAutomobile(Automobile automobile, int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "UPDATE Automobile as a " +
                    "SET title = :title, " +
                    "price = :price, " +
                    "manufacture_date = :manufacture_date, " +
                    "sell_date = :sell_date, " +
                    "gear_type = :gear_type, " +
                    "fuel_volume = :fuel_volume " +
                    "WHERE id = :id";

            Query query = session.createQuery(hql);
            query.setParameter("id", automobile.getId());
            query.setParameter("title", automobile.getTitle());
            query.setParameter("price", automobile.getPrice());
            query.setParameter("manufacture_date", automobile.getManufacture_date());
            query.setParameter("sell_date", automobile.getSell_date());
            query.setParameter("gear_type", automobile.getGear_type());
            query.setParameter("fuel_volume", automobile.getFuel_volume());
            query.setParameter("id", id);
            query.executeUpdate();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteAutomobileById(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Automobile student = session.get(Automobile.class, id);
            if (student != null) {
                String hql = "DELETE FROM Automobile " + "WHERE id = :id";
                Query query = session.createQuery(hql);
                query.setParameter("id", id);
                int result = query.executeUpdate();
                System.out.println("Rows affected: " + result);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteAllAutomobile() {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "DELETE FROM Automobile";
            Query query = session.createQuery(hql);
            query.executeUpdate();
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Automobile getAutomobileById(int id) {
        Transaction transaction = null;
        Automobile automobile = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            String hql = " FROM Automobile a WHERE a.id = :automobileId";
            Query query = session.createQuery(hql);
            query.setParameter("automobileId", id);
            List results = query.getResultList();

            if (results != null && !results.isEmpty()) {
                automobile = (Automobile) results.get(0);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return automobile;
    }

    public static List<Automobile> getAutomobileByTitle(String title) {
        Transaction transaction = null;
        List<Automobile> results = Collections.emptyList();
        ;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            String hql = "FROM Automobile a WHERE a.title = :automobile_title";
            Query query = session.createQuery(hql);
            query.setParameter("automobile_title", title);
            results = query.getResultList();
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return results;
    }

    public static List<Automobile> listAll() {
        Transaction transaction = null;
        List<Automobile> results = Collections.emptyList();
        ;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = " FROM Automobile";
            Query query = session.createQuery(hql);
            results = query.getResultList();
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return results;
    }

    public static List<Automobile> getAutomobileByPrice(int min, int max) {
        Transaction transaction = null;
        List<Automobile> results = Collections.emptyList();
        ;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = " FROM Automobile a WHERE a.price BETWEEN :min AND :max";
            Query query = session.createQuery(hql);
            query.setParameter("min", min);
            query.setParameter("max", max);
            results = query.getResultList();
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return results;
    }


    public List<Automobile> getAutomobile() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Automobile", Automobile.class).list();
        }
    }
}
