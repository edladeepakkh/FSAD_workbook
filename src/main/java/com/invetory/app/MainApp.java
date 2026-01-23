package com.invetory.app;

import com.invetory.dao.ProductDAO;
import com.invetory.entity.Product;

public class MainApp {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        Product product = new Product("Mobile", 25000);

        dao.addProduct(product);
    }
}
