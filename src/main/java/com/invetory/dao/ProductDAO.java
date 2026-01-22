package com.invetory.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.invetory.entity.Product;
import com.invetory.util.HibernateUtil;

public class ProductDAO {

    public void addProduct(Product product) {

        Transaction tx = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            tx = session.beginTransaction();
            session.save(product);
            tx.commit();

            System.out.println("✅ Product inserted successfully");

        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}
