package service;

import pl.dzmats.sales.Basket;

public interface BasketService {

    Long save(Basket basket);
    void add(Long idBasket, Long idProduct);
    boolean isEmpty();
    Integer productsCount();
}
