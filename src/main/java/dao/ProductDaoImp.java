package dao;

import pl.dzmats.sales.Product;
import util.IdGenerator;

import java.math.BigDecimal;
import java.util.HashMap;

public class ProductDaoImp {

    private static HashMap<Long, Product> products = new HashMap<Long, Product>();

    static {
        Long id = IdGenerator.getnextAvailLongId();
        products.put(id, new Product(id, BigDecimal.valueOf(35.75), "Do odtwarzania muzyki", "Słuchawki"));

        id = IdGenerator.getnextAvailLongId();
        products.put(id, new Product(id, BigDecimal.valueOf(1000.00), "Do pracy", "laptop"));

        id = IdGenerator.getnextAvailLongId();
        products.put(id, new Product(id, BigDecimal.valueOf(25.40), "Do ogladania", "telewizor"));
    }
}
