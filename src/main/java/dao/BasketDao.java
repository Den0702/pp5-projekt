package dao;

import pl.dzmats.sales.Basket;

public interface BasketDao {

    Basket findById(Long idBasket);
    Long save(Basket basket);
    void update (Basket basket);
}
