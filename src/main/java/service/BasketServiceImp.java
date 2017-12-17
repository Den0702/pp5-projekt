package service;

import dao.BasketDao;
import dao.OrderDao;
import dao.ProductDao;
import pl.dzmats.sales.Basket;
import pl.dzmats.sales.BasketItem;
import pl.dzmats.sales.Product;

public class BasketServiceImp implements BasketService {

    BasketDao baseketDao;
    ProductDao productDao;
    OrderDao orderDao;
    private boolean empty;

    public BasketServiceImp(){
        this.empty = true;
    }
    @Override
    public Long save (Basket basket){
        return baseketDao.save(basket);

    }

    public void add(Long idBasket, Long idProduct){
        Basket basket = baseketDao.findById(idBasket);
        Product product = productDao.findById(idProduct);
        basket.getLinesItems().add(new BasketItem(product, 1, product.getPrice()));
        basket.setSubtotal(basket.calculateTotal());
        baseketDao.update(basket);
    }

    public boolean isEmpty() {
        return empty;
    }

    public Integer productsCount() {
		return 2;
	}
}
