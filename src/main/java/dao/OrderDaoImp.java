package dao;

import pl.dzmats.sales.Order;
import util.IdGenerator;

import java.util.HashMap;

public class OrderDaoImp {

    private static HashMap<Long, Order> orders = new HashMap<Long, Order>();

    public Order save (Order order){
        Long orderNumber = IdGenerator.getnextAvailLongId();
        order.setIdodrder(orderNumber);
        orders.put(orderNumber, order);
        return order;
    }
}
