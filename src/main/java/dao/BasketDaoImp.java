package dao;

import pl.dzmats.sales.Basket;
import util.IdGenerator;
//import org.springframework.stereotype.Repository;
import java.util.HashMap;

public class BasketDaoImp implements BasketDao {
    private static HashMap<Long, Basket> shoppingBasketList = new HashMap<Long, Basket>();

    @Override
    public Basket findById(Long idBasket){
        return shoppingBasketList.get(idBasket);
    }

    @Override
    public Long save(Basket basket){
        Long temp = IdGenerator.getnextAvailLongId();
        basket.setIdBasket(temp);
        shoppingBasketList.put(basket.getIdBasket(), basket);
        return temp;
    }

    @Override
    public void update(Basket basket) {
        shoppingBasketList.put(basket.getIdBasket(), basket);
    }

}
