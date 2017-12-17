package pl.dzmats.sales;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order implements java.io.Serializable {
    private Long idodrder;
    private BigDecimal total;
    private List<BasketItem> linesItems = new ArrayList<BasketItem>();

    public Order(Long idodrder, BigDecimal total, List<BasketItem> linesItems) {
        this.idodrder = idodrder;
        this.total = total;
        this.linesItems = linesItems;
    }

    public Long getIdodrder() {
        return idodrder;
    }

    public void setIdodrder(Long idodrder) {
        this.idodrder = idodrder;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setLinesItems(List<BasketItem> linesItems) {
        this.linesItems = linesItems;
    }

    public List<BasketItem> getLinesItems() {
        return linesItems;
    }
}

