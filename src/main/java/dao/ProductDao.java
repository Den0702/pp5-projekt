package dao;

import pl.dzmats.sales.Product;

import java.util.List;

public interface ProductDao {

    Product findById(Long idProduct);
    List<Product> findAll();
}
