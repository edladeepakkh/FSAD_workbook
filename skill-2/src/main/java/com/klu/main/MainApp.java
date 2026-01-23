package com.klu.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.klu.model.Product;
import com.klu.util.HibernateUtil;

public class MainApp {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        // INSERT
        Product p1 = new Product("Laptop", "Dell i7", 75000, 10);
        session.save(p1);

        // FETCH
        Product product = session.get(Product.class, 1);
        System.out.println(product.getName());

        // UPDATE
        product.setPrice(70000);
        session.update(product);

        // DELETE
        // session.delete(product);

        tx.commit();
        session.close();
    }
}
