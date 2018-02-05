package pl.dzmats.sales;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket implements java.io.Serializable{
	private boolean empty;
	private List<BasketItem> linesItems = new ArrayList<BasketItem>();
	//private final ArrayList<Product> productsList;
	private BigDecimal subtotal;
	//private final HashMap<Product, Integer> productQuantities;
	private Long idBasket;

	public Basket(Long idBasket, BigDecimal subtotal)
	{
		this.idBasket = idBasket;
		this.subtotal = subtotal;
	}

	public Basket(Long idBasket, BigDecimal subtotal, List<BasketItem> linesItems) {
		this.idBasket = idBasket;
		this.subtotal = subtotal;
		this.linesItems = linesItems;
		this.empty = true;
		//this.productsList = new ArrayList<Product>();
		//this.productQuantities = new HashMap<Product, Integer>();
	}

	public Long getIdBasket() {
		return idBasket;
	}

	public void setIdBasket(Long idBasket) {
		this.idBasket = idBasket;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public List<BasketItem> getLinesItems() {
		return linesItems;
	}

	public void setLinesItems(List<BasketItem> linesItems) {
		this.linesItems = linesItems;
	}

	public BigDecimal calculateTotal(){//okreslamy wartosc koszyka
		BigDecimal total = BigDecimal.ZERO;
		for(BasketItem lineItem : this.getLinesItems()){
			total = total.add(lineItem.getPrice().multiply(new BigDecimal((lineItem.getQuantity()))));
		}
		return  total;
	}

//	public void add(Product product) {
//		empty = false;
//		productsList.add(product);
//
//		if (!productQuantities.containsKey(product)) {
//			productQuantities.put(product, 1);
//		} else {
//			Integer qty = productQuantities.get(product);
//			qty++;
//		}
//	}

	public boolean isEmpty() {
		return empty;
	}

//	public Integer productsCount() {
//		return productQuantities.size();
//	}
}
