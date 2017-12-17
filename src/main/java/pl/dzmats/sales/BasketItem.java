package pl.dzmats.sales;

import java.math.BigDecimal;

public class BasketItem {

    private Product product;
    private Integer quantity;
    private BigDecimal price;

    public BasketItem(Product product, Integer quantity, BigDecimal price)
    {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
